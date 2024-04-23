package com.example.listview

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView



class Myadapter(val context: Activity,val arrayList: ArrayList<User>):
    ArrayAdapter<User>(Context,R.layout.custom_user,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


        val inflater=LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.custom_user,null)
        val name = view.findViewById<TextView>(R.id.Name)
        val lastMsg = view.findViewById<TextView>(R.id.lastMsg)
        val lastMsgTime = view.findViewById<TextView>(R.id.lastMsgTime)
        val imageId = view.findViewById<CircleImageView>(R.id.image)

        name.text = arrayList[position].name
        lastMsg.text = arrayList[position].lastMsg
        lastMsgTime.text = arrayList[position].lastMsgTime
        imageId.setImageResource(arrayList[position].imageID)
        return view
    }






















































//class Myadapter (val context: Activity, private val arrayList: ArrayList<User>):
//    ArrayAdapter<User>(context,R.layout.custom_user, arrayList) {
//
//    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//
//        val inflater = LayoutInflater.from(context)
//        val view = inflater.inflate(R.layout.custom_user,null)
//        val image = view.findViewById<CircleImageView>(R.id.image)
//        val name = view.findViewById<TextView>(R.id.Name)
//        val lastMsg = view.findViewById<TextView>(R.id.lastMsg)
//        val lastMsgTime = view.findViewById<TextView>(R.id.lastMsgTime)
//
//
//        name.text =arrayList[position].name
//        image.setImageResource(arrayList[position].imageID)
//        lastMsg.text = arrayList[position].lastMsg
//        lastMsgTime.text = arrayList[position].lastMsgTime
//
//
//
//        return view
//    }
}