package tmdb.arch.movieapp.ui.screens.discover

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import tmdb.arch.movieapp.R
import tmdb.arch.movieapp.databinding.MoviesDiscoverBinding
import tmdb.arch.movieapp.utils.delegates.viewBinding
import tmdb.arch.movieapp.utils.extensions.collectRepeatOnStart

class DiscoverMovies: Fragment(R.layout.movies_discover) {
  private val binding by viewBinding(MoviesDiscoverBinding::bind)
  private val viewModel by viewModel<DiscoverMoviesViewModel>()

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    viewModel.text.collectRepeatOnStart(viewLifecycleOwner) {
      binding.searchButton.text = it
    }

    // This is same as above we added an extension in FlowExtensions.kt
//    viewLifecycleOwner.lifecycleScope.launch {
//      viewLifecycleOwner.lifecycle.repeatOnLifecycle(state = Lifecycle.State.STARTED) {
//        viewModel.text.collectLatest {
//          binding.searchButton.text = it
//        }
//      }
//    }
  }
}