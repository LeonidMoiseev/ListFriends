package com.thenightlion.listfriends.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.thenightlion.listfriends.R
import com.thenightlion.listfriends.models.FriendsModel

class FriendsAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var mFriendsList: ArrayList<FriendsModel> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return FriendsViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cell_friend, parent, false))
    }

    override fun getItemCount(): Int {
        return mFriendsList.count()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    }

    class FriendsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}