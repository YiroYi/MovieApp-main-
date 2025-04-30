package tmdb.arch.movieapp.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import tmdb.arch.movieapp.domain.repository.MoviesRepository
import tmdb.arch.movieapp.domain.useCases.GetLatestMoviesUseCase
import tmdb.arch.movieapp.domain.useCases.MoviesSearchInteractor
import tmdb.arch.movieapp.ui.screens.details.MoviesDetailsViewModel
import tmdb.arch.movieapp.ui.screens.discover.DiscoverMoviesViewModel
import tmdb.arch.movieapp.ui.screens.saved.SavedMoviesViewModel
import tmdb.arch.movieapp.ui.screens.search.SearchMoviesViewModel

val viewModels = module {
  viewModel { DiscoverMoviesViewModel(getLatestMoviesUseCase = get<GetLatestMoviesUseCase>()) }
  viewModel { MoviesDetailsViewModel() }
  viewModel { SearchMoviesViewModel(searchInteractor = get<MoviesSearchInteractor>()) }
  viewModel { SavedMoviesViewModel() }
}

val usecases = module {
  factory { GetLatestMoviesUseCase(repository = get<MoviesRepository>()) }
  factory { MoviesSearchInteractor(repository = get<MoviesRepository>()) }
}