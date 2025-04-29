package tmdb.arch.movieapp.utils

import android.annotation.SuppressLint
import androidx.recyclerview.widget.DiffUtil

class SingleDiffCallback<T: Any>: DiffUtil.ItemCallback<T>() {
  override fun areItemsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem::class == newItem::class
      }

      @SuppressLint("DiffUtilEquals")
      override fun areContentsTheSame(oldItem: T, newItem: T): Boolean {
        return oldItem == newItem
      }
}