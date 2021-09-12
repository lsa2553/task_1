package com.example.task_1.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.task_1.R

class ProfileAdapter(val profileList: ArrayList<Profile>) : RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return CustomViewHolder(view)
    }

    override fun getItemCount(): Int {
        return profileList.size
    }

    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
        holder.face.setImageResource(profileList.get(position).face)
        holder.name.text = profileList.get(position).name
    }


    class CustomViewHolder(itemview: View): RecyclerView.ViewHolder(itemview){
        val face =  itemview.findViewById<ImageView>(R.id.storyProfile) //프로필 이미지
        val name = itemview.findViewById<TextView>(R.id.instaId)//이디
    }

}