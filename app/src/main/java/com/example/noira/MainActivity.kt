package com.example.noira

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.Firebase
import com.google.firebase.database.database
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val database = Firebase.database("https://noira-25-default-rtdb.asia-southeast1.firebasedatabase.app")
        val myRef = database.getReference("message")

        Log.d("Firebase", "Pushing to firebase")
        myRef.setValue("Hello, Firebase HEHE!")
    }
}