package tmdb.arch.movieapp.ui.screens.discover.adapters

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import tmdb.arch.movieapp.BuildConfig
import tmdb.arch.movieapp.databinding.MovieListItemBinding
import tmdb.arch.movieapp.domain.model.Movie
import tmdb.arch.movieapp.ui.common.MovieViewHolder
import tmdb.arch.movieapp.utils.SingleDiffCallback
import tmdb.arch.movieapp.utils.delegates.viewBinding

class MoviesListAdapter(): PagingDataAdapter<Movie, MovieViewHolder>(SingleDiffCallback<Movie>()) {
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