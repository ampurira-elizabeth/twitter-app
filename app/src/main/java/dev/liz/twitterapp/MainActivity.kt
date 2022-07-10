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
        var tweet=Tweets("Julio Barisi","Live a life that you will remeber","200",
        "wow","5","God knows your every move","10k","#lifeQuotes","")
        var tweet2=Tweets("Aggie Barisi","Live a life that you will remeber","50",
            "wow","15","Life once lived is not forgotten","10k","#lifeQuotes","")
        var tweet3=Tweets("Lizie Barisi","Live a life that you will remeber","300",
            "wow","75","live alife that you will remember","100k","#lifeQuotes","")
        var tweet4=Tweets("Raxie Barisi","Be contented with whatever you have","20",
            "wow","5","With God everything is possible","80k","#lifeQuotes","")
        var tweet5=Tweets("Hillz Barisi","Be contented with whatever you have","20",
            "wow","5","With God everything is possible","80k","#lifeQuotes","")
        var tweetsList= listOf(tweet,tweet2,tweet3,tweet4,tweet5)
        var tweetAdapter=twitter_Adapter_View(tweetsList)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
        binding.rvTweets.adapter=tweetAdapter
    }
}