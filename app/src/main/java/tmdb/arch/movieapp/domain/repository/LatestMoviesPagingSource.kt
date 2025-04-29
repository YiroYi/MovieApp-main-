package tmdb.arch.movieapp.domain.repository

import androidx.paging.PagingSource
import androidx.paging.PagingState
import tmdb.arch.movieapp.domain.model.Movie
import tmdb.arch.movieapp.domain.model.remote.toModel
import tmdb.arch.movieapp.domain.remote.MoviesService

class LatestMoviesPagingSource(
  private val  service: MoviesService
): PagingSource<Int, Movie>() {
  override fun getRefreshKey(state: PagingState<Int, Movie>) = 1

  override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
    val key = params.key ?: 1

    return try {
      val response = service.getLatestMovies(key)
        .moviesDtos
        .map { it.toModel() }

      LoadResult.Page(
        data = response,
        prevKey = null,
        nextKey = key + 1
      )
    } catch (e: Exception) {
      LoadResult.Error(e)
    }
  }
}