package uz.datatalim.instagramfeedclone.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.datatalim.instagramfeedclone.R
import uz.datatalim.instagramfeedclone.model.Feed

class FeedAdapter(val context: Context, val list: ArrayList<Feed>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    val ITEM_STORY = 0;
    val ITEM_POST = 1;

    override fun getItemViewType(position: Int): Int {
        return if (!list[position].stories.isNullOrEmpty()) ITEM_STORY
        else ITEM_POST
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view: View
        return if (viewType == ITEM_STORY) {
            view =
                LayoutInflater.from(parent.context).inflate(R.layout.item_story_main, parent, false)
            StoryViewHolder(view)
        } else {
            view = LayoutInflater.from(parent.context).inflate(R.layout.item_feed, parent, false)
            PostViewHolder(view)
        }

    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val feed = list[position]
        if (holder is PostViewHolder) {
            //postlarni ulimiz
        }
        if (holder is StoryViewHolder) {
            //story rv ulimiz
            holder.apply {
                rvStories.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                rvStories.adapter = StoryAdapter(feed.stories!!)
            }
        }

    }


    class PostViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvUserName = view.findViewById<TextView>(R.id.tv_user_name)

    }

    class StoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val rvStories = view.findViewById<RecyclerView>(R.id.rvStory)
    }

}