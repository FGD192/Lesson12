package es.fgd192.lesson12

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycle_item.view.*

class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    fun bind(itemData: ItemData) {
        itemView.TeVi.text = itemData.teVi
        itemView.TeVi2.text = itemData.teVi2
    }
}