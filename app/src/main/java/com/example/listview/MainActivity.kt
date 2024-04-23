package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var UserArrayList:ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listView = findViewById<ListView>(R.id.List1)


        val name= arrayOf("Abhijeet Dubey","Krishna Patel","Piyush Dixit","Tejas Arora","Sidhant Pandey","Ronit Jain")
        val lastMsg= arrayOf("hiiii","call @9","yes we'll go","khelna hai?","ok","hello?")
        val lastMsgTime= arrayOf("5:30 AM","4:30 PM","5:30 AM","4:30 PM","5:30 AM","4:30 PM")
        val imageId= intArrayOf(R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.baseline_home_24,R.drawable.baseline_app_settings_alt_24,)

        UserArrayList=ArrayList()


        for(i in name.indices)
        {
            val user=User(imageId[i],name[i],lastMsg[i],lastMsgTime[i])
            UserArrayList.add(user)
        }


        listView.isClickable=true
        listView.adapter=Myadapter(this,UserArrayList)

        }
    }