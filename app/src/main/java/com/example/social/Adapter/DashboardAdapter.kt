package com.example.social.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.social.Model.DashboardModel
import com.example.social.Model.StoryModel
import com.example.social.R

class DashboardAdapter(var list: ArrayList<DashboardModel>, var context: Context?):RecyclerView.Adapter<DashboardAdapter.viewHolder>()  {
    public class viewHolder(itemView: View) :RecyclerView.ViewHolder(itemView){
        var profileImg : ImageView =itemView.findViewById(R.id.profile_image)
        var postImg : ImageView =itemView.findViewById(R.id.postImg)
        var bookmark : ImageView =itemView.findViewById(R.id.bookmark)
        var userName : TextView = itemView.findViewById(R.id.userName)
        var about : TextView = itemView.findViewById(R.id.about)
        var likeCount : TextView = itemView.findViewById(R.id.likeCount)
        var commentCount : TextView = itemView.findViewById(R.id.commentCount)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        var view = LayoutInflater.from(context).inflate(R.layout.dashboard_rv_design,parent,false)
         return  viewHolder(view)
    }

    override fun getItemCount(): Int {
  return list.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        var model = list[position]
        holder.profileImg.setImageResource(model.profile)
        holder.postImg.setImageResource(model.postImg)
        holder.bookmark.setImageResource(model.bookmark)
        holder.userName.text = model.userName
        holder.about.text = model.about
        holder.likeCount.text = model.likeCount
        holder.commentCount.text = model.commentCount
    }
}