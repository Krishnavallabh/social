package com.example.social.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.social.Adapter.NotificationAdapter
import com.example.social.Model.NotificationModel
import com.example.social.R




class Notification2Fragment : Fragment() {
     lateinit var notificationRV : RecyclerView
     lateinit var notificationList : ArrayList<NotificationModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       var view = inflater.inflate(R.layout.fragment_notification2, container, false)
        notificationRV = view.findViewById(R.id.notificationRV)
        notificationList = ArrayList()
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment : try again","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))
        notificationList.add(NotificationModel(R.drawable.pic3,"<b>aman</b> mentioned you in a comment","just now"))

       var adapter = NotificationAdapter(notificationList,context)
        var layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        notificationRV.layoutManager =layoutManager
        notificationRV.adapter = adapter
        adapter.notifyDataSetChanged()
return view

}
    }