package com.example.social.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.social.Model.StoryModel
import com.example.social.R

class StoryAdapter(var list: ArrayList<StoryModel>, var context: Context?) : RecyclerView.Adapter<StoryAdapter.viewHolder>() {

    public class viewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    var story :ImageView =itemView.findViewById(R.id.story)
    var storyType :ImageView =itemView.findViewById(R.id.storyType)
    var profileImg :ImageView =itemView.findViewById(R.id.profile_image)
        var userName : TextView = itemView.findViewById(R.id.user_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
             var view =LayoutInflater.from(context).inflate(R.layout.story_rv_design,parent,false)

            return    viewHolder(view)
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        var model = list[position]
        holder.story.setImageResource(model.story)
        holder.storyType.setImageResource(model.storyType)
        holder.profileImg.setImageResource(model.profileImg)
        holder.userName.text = model.userName
    }

}