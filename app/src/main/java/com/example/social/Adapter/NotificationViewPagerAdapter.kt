package com.example.social.Adapter

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.social.Fragment.Notification2Fragment
import com.example.social.Fragment.RequestFragment


class  NotificationViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int {
  return  2
    }

    override fun getItem(position: Int): Fragment {

    when (position)
    {
        0 -> return Notification2Fragment()
        1 -> return RequestFragment()
        else -> {return Notification2Fragment()}
    }

    //     if(position==0)
//     { return Notification2Fragment()
//
//     }
//        else
//     { return RequestFragment()}
  }

    override fun getPageTitle(position: Int): CharSequence? {
       var title : String = "NOTIFICATION"
        Log.d("hiiii","hellooo")
        if(position==0)
        {title="NOTIFICATION"}
        else if(position==1){
            title ="REQUEST"
        }
        return title

    }
}