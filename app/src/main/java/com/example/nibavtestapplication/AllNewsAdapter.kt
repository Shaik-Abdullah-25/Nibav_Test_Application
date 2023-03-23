package com.example.nibavtestapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nibavtestapplication.databinding.FragmentAllNewsBinding
import com.example.nibavtestapplication.databinding.SampleAllNewBinding
import retrofit2.Callback

class AllNewsAdapter(private var frame: List<Dataa>, private var context: Context , private var callback: Callback)
    : RecyclerView.Adapter<AllNewsAdapter.MyViewHolder>() {


    interface Callback {
        fun imageTCategoryClicked()
    }

    class MyViewHolder(binding: SampleAllNewBinding, cont: Context) : RecyclerView.ViewHolder(binding.root) {
        val playerImages = binding.playerImage
        val playerName = binding.playerName
        val playerPosition = binding.playerPosition
        val playerTitle = binding.playerTitle
        val playerDetails = binding.playerDetails
        val playerIcon = binding.playerIcon

        val con = cont
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(SampleAllNewBinding.inflate(LayoutInflater.from(parent.context)), parent.context)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val frames : Dataa = frame[position]

        //holder.binding!!.root.context.let {
            Glide.with(holder.con)
                .load(frames.player_image_url)
                .into(holder.playerImages)
       // }

        //holder.binding.root.context.let {
            Glide.with(context)
                .load(frames.source_logo)
                .into(holder.playerIcon)
        //}

        holder.playerName.text = frames.pname
        holder.playerPosition.text = frames.position
        holder.playerTitle.text = frames.title
        holder.playerDetails.text = frames.details
    }

    override fun getItemCount(): Int {
        return frame.size
    }
}