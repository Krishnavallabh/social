package com.example.social.Adapter

import android.content.Context
import android.text.Html
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.social.Model.NotificationModel
import com.example.social.R

class NotificationAdapter(var notificationList : ArrayList<NotificationModel>, var context : Context?):RecyclerView.Adapter<NotificationAdapter.viewHolder>() {

    public class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var profile:ImageView  = itemView.findViewById(R.id.profile_image)
        var time  :TextView= itemView.findViewById(R.id.time)
        var notification  :TextView= itemView.findViewById(R.id.notification)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
val view =LayoutInflater.from(context).inflate(R.layout.notification2_rv_design,parent,false)
    return viewHolder(view)
    }

    override fun getItemCount(): Int {
  return  notificationList.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
   var model = notificationList[position]
        holder.profile.setImageResource(model.profile)
        holder.notification.text = Html.fromHtml(model.notification)
        holder.time.text = model.time
    }
}