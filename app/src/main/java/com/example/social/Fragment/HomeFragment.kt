package com.example.social.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.social.Adapter.DashboardAdapter
import com.example.social.Adapter.StoryAdapter
import com.example.social.Model.DashboardModel
import com.example.social.Model.StoryModel
import com.example.social.R




class HomeFragment : Fragment() {

    lateinit var storyRV: RecyclerView
    var list = ArrayList<StoryModel>()
    lateinit var dashboardRV :RecyclerView
    var listPost =ArrayList<DashboardModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_home, container, false)
        storyRV = view.findViewById(R.id.storyRV)
        list.add(StoryModel(R.drawable.pic3,"patidar",R.drawable.pic4,R.drawable.video))
        list.add(StoryModel(R.drawable.pic1,"patidar",R.drawable.pic5,R.drawable.live))
        list.add(StoryModel(R.drawable.pic2,"patidar",R.drawable.pic1,R.drawable.video))
        list.add(StoryModel(R.drawable.pic4,"patidar",R.drawable.pic2,R.drawable.live))
        list.add(StoryModel(R.drawable.pic5,"patidar",R.drawable.pic3,R.drawable.video))
        list.add(StoryModel(R.drawable.pic1,"patidar",R.drawable.pic4,R.drawable.live))
        list.add(StoryModel(R.drawable.pic3,"patidar",R.drawable.pic4,R.drawable.video))
        list.add(StoryModel(R.drawable.pic1,"patidar",R.drawable.pic5,R.drawable.live))
        val adapter = StoryAdapter(list,context)
        val layoutManager =LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        storyRV.layoutManager = layoutManager
     //   storyRV.isNestedScrollingEnabled  = false
        storyRV.setNestedScrollingEnabled(false)
        storyRV.adapter =adapter




          dashboardRV = view.findViewById(R.id.dashboardRV)
        listPost.add(DashboardModel(R.drawable.pic1,R.drawable.pic1,R.drawable.bookmark_white,"krishna","patidar","100","200"))
        listPost.add(DashboardModel(R.drawable.pic3,R.drawable.pic1,R.drawable.bookmark_white,"krishna","patidar","200","100"))
        listPost.add(DashboardModel(R.drawable.pic2,R.drawable.pic1,R.drawable.bookmark_white,"krishna","patidar","2100","398"))
        listPost.add(DashboardModel(R.drawable.pic4,R.drawable.pic1,R.drawable.bookmark_white,"krishna","patidar","2739","3637"))
        listPost.add(DashboardModel(R.drawable.pic5,R.drawable.pic1,R.drawable.bookmark_white,"krishna","patidar","367","946"))
        listPost.add(DashboardModel(R.drawable.pic1,R.drawable.pic1,R.drawable.bookmark_white,"krishna","patidar","7927","63"))
        listPost.add(DashboardModel(R.drawable.pic3,R.drawable.pic1,R.drawable.bookmark_white,"krishna","patidar","527","26"))
        listPost.add(DashboardModel(R.drawable.pic1,R.drawable.pic1,R.drawable.bookmark_white,"krishna","patidar","2563","1"))
        val dashboardAdapter = DashboardAdapter(listPost,context)
        val dashboardLayoutManager =LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        dashboardRV.layoutManager = dashboardLayoutManager
     //   storyRV.isNestedScrollingEnabled  = false
      //  dashboardRV.setNestedScrollingEnabled(false)
        dashboardRV.adapter =dashboardAdapter



        return view
    }


}


