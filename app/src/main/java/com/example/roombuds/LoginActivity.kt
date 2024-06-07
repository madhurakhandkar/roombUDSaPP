package com.example.roombuds

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val button2 = findViewById<Button>(R.id.button2)

     //   val intent = Intent(this, SignUpActivity::class.java)
      //  intent.putExtra("key", "value")

        button2.setOnClickListener {
            Log.d("LoginAcitivty", "Sign Up Button clicked")
            val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
            intent.putExtra("key", "value")
            startActivity(intent)
        }
        //finish()
    }
}