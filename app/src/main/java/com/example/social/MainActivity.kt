package com.example.social

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.view.Menu
import android.view.View
import androidx.fragment.app.FragmentTransaction
import com.example.social.Fragment.HomeFragment
import com.example.social.Fragment.NotificationFragment
import com.example.social.Fragment.PostFragment
import com.example.social.Fragment.ProfileFragment
import com.example.social.Fragment.SearchFragment
import com.example.social.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbar.title = "My profile"
     setSupportActionBar(binding.toolbar)
        binding.toolbar.visibility = View.GONE
        val transaction :FragmentTransaction =supportFragmentManager.beginTransaction()

        transaction.replace(R.id.container,HomeFragment())
        transaction.commit()

    binding.bottomAppBar.setOnItemSelectedListener {
        val id = it.itemId

        val transaction :FragmentTransaction =supportFragmentManager.beginTransaction()

        if(id==R.id.home)
        {
            binding.toolbar.visibility = View.GONE
            transaction.replace(R.id.container,HomeFragment())
        }
        else if(id==R.id.search){
            binding.toolbar.visibility = View.GONE

            transaction.replace(R.id.container,SearchFragment())

        } else if(id==R.id.post){
            binding.toolbar.visibility = View.GONE

            transaction.replace(R.id.container,PostFragment())

        } else if(id==R.id.notification){
            binding.toolbar.visibility = View.GONE

            transaction.replace(R.id.container,NotificationFragment())

        } else if(id==R.id.user){
            binding.toolbar.visibility = View.VISIBLE

            transaction.replace(R.id.container,ProfileFragment())

        }
        transaction.commit()
        true
    }

        binding.bottomAppBar.setOnItemReselectedListener {
            val id = it.itemId

            val transaction :FragmentTransaction =supportFragmentManager.beginTransaction()

            if(id==R.id.home)
            {
                binding.toolbar.visibility = View.GONE
                transaction.replace(R.id.container,HomeFragment())
            }
            else if(id==R.id.search){
                binding.toolbar.visibility = View.GONE

                transaction.replace(R.id.container,SearchFragment())

            } else if(id==R.id.post){
                binding.toolbar.visibility = View.GONE

                transaction.replace(R.id.container,PostFragment())

            } else if(id==R.id.notification){
                binding.toolbar.visibility = View.GONE

                transaction.replace(R.id.container,NotificationFragment())

            } else if(id==R.id.user){
                binding.toolbar.visibility = View.VISIBLE

                transaction.replace(R.id.container,ProfileFragment())

            }
            transaction.commit()

        }
}

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu,menu)
        return true
    }
}
