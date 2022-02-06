package com.example.imodarkmodeui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imodarkmodeui.R
import com.example.imoui.model.Chat
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(var items: ArrayList<Chat>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_chat_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chat = items[position]
        if (holder is ViewHolder) {
            holder.apply {
                iv_profile.setImageResource(chat.profile)
                tv_fullname.text = chat.fullname
                tv_message_count.text = chat.count.toString()

                if (chat.count > 0) {
                    tv_message_count.visibility = View.VISIBLE
                } else {
                    tv_message_count.visibility = View.GONE
                }
            }
        }
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val iv_profile: ShapeableImageView = view.findViewById(R.id.iv_profile)
        val tv_fullname: TextView = view.findViewById(R.id.tv_fullname)
        val tv_message_count: TextView = view.findViewById(R.id.tv_message_count)
    }
}