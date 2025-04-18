package tmdb.arch.movieapp.domain.remote

import retrofit2.http.GET
import retrofit2.http.Query
import tmdb.arch.movieapp.domain.model.remote.MovieListResponse

interface MoviesService {
  @GET("discover/movie")
  suspend fun getLatestMovies(
    @Query("page") page: Int,
    @Query("sort_by") sortBy: String = "primary_ release_date.desc"
  ): MovieListResponse

}