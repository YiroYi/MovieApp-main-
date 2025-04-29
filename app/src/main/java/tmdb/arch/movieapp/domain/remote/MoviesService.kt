package tmdb.arch.movieapp.domain.remote

import retrofit2.http.GET
import retrofit2.http.Query
import tmdb.arch.movieapp.domain.model.remote.MovieListResponse
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

interface MoviesService {
  @GET("discover/movie")
  suspend fun getLatestMovies(
    @Query("page") page: Int,
    @Query("sort_by") sortBy: String = "release_date.desc",
    @Query("release_date.lte") dateFilter: String = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
      .format(Date())
  ): MovieListResponse

}