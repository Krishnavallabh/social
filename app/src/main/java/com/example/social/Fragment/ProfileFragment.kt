package com.example.social.Fragment

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.social.Adapter.friendListAdapter
import com.example.social.Model.friendListModel
import com.example.social.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class ProfileFragment : Fragment() {

   lateinit var friendListRV : RecyclerView
   lateinit var friendList :ArrayList<friendListModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     var view = inflater.inflate(R.layout.fragment_profile, container, false)

        friendListRV = view.findViewById(R.id.friendListRV1)
        friendList = ArrayList<friendListModel>()
        friendList.add(friendListModel(R.drawable.pic1))
        friendList.add(friendListModel(R.drawable.pic2))
        friendList.add(friendListModel(R.drawable.pic3))
        friendList.add(friendListModel(R.drawable.pic4))
        friendList.add(friendListModel(R.drawable.pic5))
        friendList.add(friendListModel(R.drawable.pic1))
        friendList.add(friendListModel(R.drawable.pic2))
        val adapter = friendListAdapter(context,friendList)
        val layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        friendListRV.layoutManager =layoutManager
        friendListRV.adapter =adapter

        return view
    }


}