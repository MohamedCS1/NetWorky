package com.example.networky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.networky.databinding.ActivityThemeDetailsBinding

class ThemeDetailsActivity : AppCompatActivity() {

    lateinit var binding:ActivityThemeDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThemeDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var x = true
        binding.buLike.setOnClickListener {
            if (x)
            {
                binding.textlikes.text = "31 likes"
                binding.buLike.setBackgroundResource(R.drawable.ic_heart_selected)
                x = false
            }else{
                binding.textlikes.text = "30 likes"
                binding.buLike.setBackgroundResource(R.drawable.ic_love)
                x = true
            }

        }

        binding.buBack.setOnClickListener {
            onBackPressed()
        }

        binding.buJoindre.setOnClickListener {
            startActivity(Intent(this ,RoomChatActivity::class.java))
        }
    }
}