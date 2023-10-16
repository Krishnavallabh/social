package com.example.social

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.social.Model.User
import com.example.social.databinding.ActivitySignUpBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding
    var auth: FirebaseAuth = FirebaseAuth.getInstance()
    var database = FirebaseDatabase.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // auth= FirebaseAuth.getInstance()
        binding.signup.setOnClickListener(View.OnClickListener {
            var email = binding.emailEt.text.toString()
            var password = binding.passwordEt.text.toString()
            auth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                if (it.isSuccessful) {
                    var fullName = binding.nameEt.text.toString()
                    var userName =binding.usernameEt.text.toString()
                 var user = User(email,fullName,userName,password)
                    var id = it.getResult().user!!.uid
                    database.getReference().child("Users").child(id).setValue(user)

                    Toast.makeText(this,"user data saved",Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,MainActivity::class.java)
                    startActivity(intent)
                }
                else
                {
                    Toast.makeText(this,"Error ",Toast.LENGTH_SHORT).show()
                }
            }
        })
        binding.goToLogin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        })


    }
}