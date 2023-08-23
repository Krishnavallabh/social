package com.example.social.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.social.Model.friendListModel
import com.example.social.R

class friendListAdapter(var context: Context?, var friendList:ArrayList<friendListModel>) :RecyclerView.Adapter<friendListAdapter.viewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): friendListAdapter.viewHolder {
           val view =  LayoutInflater.from(context).inflate(R.layout.friend_list_rv_design,parent,false)
        return  viewHolder(view)
    }

    override fun onBindViewHolder(holder: friendListAdapter.viewHolder, position: Int) {
          val model = friendList[position]

        holder.profileImage.setImageResource(model.profileImage)
    }

    override fun getItemCount(): Int {
        return friendList.size
    }



    public class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        var profileImage :ImageView =   itemView.findViewById(R.id.profile_image)
    }
}