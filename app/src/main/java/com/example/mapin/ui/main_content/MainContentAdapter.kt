package com.example.mapin.ui.main_content

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mapin.databinding.ContentItemBinding
import com.example.mapin.databinding.ContentMainBinding

class MainContentAdapter : ListAdapter<ContentData,MainContentAdapter.MyViewHolder>(diffUtil) {
    class MyViewHolder(private val binding: ContentItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ContentData) {
            Log.d("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX",item.toString())
            binding.itemImageView.apply {
                Glide.with(this.context).load(item.imageUrl).into(this)
            }
            binding.contentTitle.text = item.title
            binding.locationText.text = item.location
            binding.tiemText.text = item.time
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = ContentItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        Log.d("AAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAA")
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<ContentData>() {
            override fun areItemsTheSame(oldItem: ContentData, newItem: ContentData): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ContentData, newItem: ContentData): Boolean {
                return oldItem == newItem
            }
        }
    }

}