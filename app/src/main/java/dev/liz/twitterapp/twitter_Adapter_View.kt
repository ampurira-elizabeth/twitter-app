package dev.liz.twitterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class twitter_Adapter_View(var tweetsList:List<Tweets>):RecyclerView.Adapter<tweetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): tweetViewHolder {
       var itemView =LayoutInflater.from(parent.context).inflate(R.layout.twitter_view,parent,false)
        return tweetViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: tweetViewHolder, position: Int) {

        var currenttweet=tweetsList.get(position)
        holder.tvName.text=currenttweet.name
        holder.tvReply.text=currenttweet.reply
        holder.tvRetweet.text=currenttweet.retweet
        holder.tvShare.text=currenttweet.share
        holder.tvPost.text=currenttweet.post
        holder.tvLike.text=currenttweet.like
        holder.tvHadle.text=currenttweet.hadle
    }

    override fun getItemCount(): Int {
      return tweetsList.size
    }
}
class tweetViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvReply=itemView.findViewById<TextView>(R.id.tvReply)
    var tvRetweet=itemView.findViewById<TextView>(R.id.tvRetweet)
    var tvLike=itemView.findViewById<TextView>(R.id.tvLike)
    var tvPost=itemView.findViewById<TextView>(R.id.tvPost)
    var tvHadle=itemView.findViewById<TextView>(R.id.tvHadle)
    var tvShare=itemView.findViewById<TextView>(R.id.tvShare)
    var ivPerson=itemView.findViewById<ImageView>(R.id.ivperson)
    var igRetweet=itemView.findViewById<ImageView>(R.id.igRetweet)
    var igReply=itemView.findViewById<ImageView>(R.id.igReply)
    var igLike=itemView.findViewById<ImageView>(R.id.igLike)
    var igShare=itemView.findViewById<ImageView>(R.id.igShare)
}
