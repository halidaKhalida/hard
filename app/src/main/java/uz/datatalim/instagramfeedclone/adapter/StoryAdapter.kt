package uz.datatalim.instagramfeedclone.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import uz.datatalim.instagramfeedclone.R
import uz.datatalim.instagramfeedclone.model.Story

class StoryAdapter(private val list: ArrayList<Story>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return StoriesViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_story, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    class StoriesViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}