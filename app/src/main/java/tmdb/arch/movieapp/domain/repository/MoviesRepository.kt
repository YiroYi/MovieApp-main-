package tmdb.arch.movieapp.domain.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import tmdb.arch.movieapp.domain.remote.MoviesService

class MoviesRepository(private val remoteService: MoviesService) {
  fun getLatestMovies() = Pager(
    config = PagingConfig(pageSize = 50)
  ) {
      LatestMoviesPagingSource(remoteService)
  }.flow
}