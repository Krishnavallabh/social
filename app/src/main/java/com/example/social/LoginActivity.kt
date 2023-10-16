package com.example.social

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.social.databinding.ActivityLoginBinding
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    var auth =FirebaseAuth.getInstance()
    var currentUser = auth.currentUser
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.login.setOnClickListener {
            var email = binding.emailEt.text.toString()
            var password = binding.passwordEt.text.toString()

            auth.signInWithEmailAndPassword(email, password).addOnCompleteListener(
                OnCompleteListener {
                    if(it.isSuccessful)
                    {
                        var intent =Intent(this,MainActivity::class.java)
                        startActivity(intent)
                    }
                })


        }

        binding.goToRegister.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        if(currentUser!=null)
        {
            var intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}