package tmdb.arch.movieapp.ui.screens.discover

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import tmdb.arch.movieapp.R
import tmdb.arch.movieapp.databinding.MoviesDiscoverBinding

class DiscoverMovies: Fragment(R.layout.movies_discover) {
  var binding: MoviesDiscoverBinding? = null

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    binding = MoviesDiscoverBinding.bind(view)
    binding?.searchButton?.text = "Searching"
  }
}