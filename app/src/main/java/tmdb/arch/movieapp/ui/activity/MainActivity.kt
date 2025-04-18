package tmdb.arch.movieapp.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import tmdb.arch.movieapp.R
import tmdb.arch.movieapp.databinding.ActivityMainBinding
import tmdb.arch.movieapp.utils.delegates.viewBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // The root refers to the layout file in this case R.layout.activity_main
        // setContentView(R.layout.activity_main)
    }
}