package com.example.task_1.main


import android.os.Bundle
import android.widget.HorizontalScrollView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.task_1.R
import com.example.task_1.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setContentView(R.layout.activity_main)


        val profileList = arrayListOf(
            Profile(R.drawable.mystory, "내 스토리"),
            Profile(R.drawable.live, "Android"),
            Profile(R.drawable.gomars, " "),
            Profile(R.drawable.story1, "apple"),
            Profile(R.drawable.story2, "nike"),
            Profile(R.drawable.story1, "apple2"),
            Profile(R.drawable.story2, "nike2")
        )

        binding.reProfile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        binding.reProfile.setHasFixedSize(true)
        binding.reProfile.adapter = ProfileAdapter(profileList)
    }
}