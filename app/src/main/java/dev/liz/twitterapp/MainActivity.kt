package dev.liz.twitterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.liz.twitterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweet=Tweets("Liz Barisi","Live a life that you will remeber","200",
        "wow","5","live alife that you will remember","10","#lifeQuotes","")
        var tweet2=Tweets("Liz Barisi","Live a life that you will remeber","200",
            "wow","5","live alife that you will remember","10","#lifeQuotes","")
        var tweetsList= listOf(tweet,tweet2)
        var tweetAdapter=twitter_Adapter_View(tweetsList)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=tweetAdapter
    }
}