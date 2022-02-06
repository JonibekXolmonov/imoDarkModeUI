package com.example.imodarkmodeui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imodarkmodeui.adapter.ChatAdapter
import com.example.imoui.model.Chat

class MainActivity : AppCompatActivity() {

    private lateinit var chats: ArrayList<Chat>
    private lateinit var chatAdapter: ChatAdapter
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.rv_chats)
        recyclerView.layoutManager = LinearLayoutManager(this)

        chats = ArrayList()
        addChats(chats)

        refreshAdapter()
    }

    private fun refreshAdapter() {
        chatAdapter = ChatAdapter(chats)
        recyclerView.adapter = chatAdapter
    }

    private fun addChats(chats: java.util.ArrayList<Chat>) {
        for (i in 0..4) {
            chats.add(Chat(R.drawable.profile_mine, "Jonibek Xolmonov", 0))
            chats.add(Chat(R.drawable.profile_azizbek, "Azizbek", 2))
            chats.add(Chat(R.drawable.profile_bogibek, "Bog'ibek Matyoqubov", 3))
            chats.add(Chat(R.drawable.profile_nazirov, "Elmurod Nazirov", 4))
            chats.add(Chat(R.drawable.profile_ogabek, "Og'abek Matyoqubov", 1))
            chats.add(Chat(R.drawable.profile_samandar, "Samandar", 0))
            chats.add(Chat(R.drawable.profile_yahyo, "Yahyo", 10))
        }
    }
}