package tmdb.arch.movieapp.utils

sealed class UiState<out T: Any> {
  object Error : UiState<Nothing>()
  object Loading : UiState<Nothing>()
  class Result<out T: Any>(val item: T) : UiState<T>()
}