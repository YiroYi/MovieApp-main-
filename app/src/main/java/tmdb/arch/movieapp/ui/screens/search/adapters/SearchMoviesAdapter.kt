package tmdb.arch.movieapp.ui.screens.search.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import tmdb.arch.movieapp.databinding.MovieListItemBinding
import tmdb.arch.movieapp.domain.model.Movie
import tmdb.arch.movieapp.ui.common.MovieViewHolder
import tmdb.arch.movieapp.utils.SingleDiffCallback
import tmdb.arch.movieapp.utils.delegates.viewBinding

class SearchMoviesAdapter: ListAdapter<Movie, MovieViewHolder>(SingleDiffCallback<Movie>()) {
  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder =
    MovieViewHolder(
      binding = parent.viewBinding { layoutInflater, viewGroup, _ ->
        MovieListItemBinding.inflate(layoutInflater, viewGroup, false)
      }
    )


  override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
    val item = getItem(position) ?:return

    holder.bind(item)
  }
}