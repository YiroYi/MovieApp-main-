package tmdb.arch.movieapp.domain.repository

import tmdb.arch.movieapp.domain.model.Movie
import tmdb.arch.movieapp.domain.model.remote.toModel
import tmdb.arch.movieapp.domain.remote.MoviesService

class MoviesRepository(private val remoteService: MoviesService) {
  suspend fun getLatestMovies(): List<Movie> {
    return remoteService
      .getLatestMovies(page = 1)
      .moviesDtos
      .map {
        it.toModel()
      }
  }
}