package com.example.networky

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.networky.Adapters.SliderAdapter
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView

class PresantationActivity : AppCompatActivity() {

    var sliderview:SliderView? = null
    var slideradapter:SliderAdapter? = null

    var bu_passer:TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presantation)

        bu_passer = findViewById(R.id.bu_passer)

        sliderview = findViewById(R.id.imageSlider)

        val arrayOfImages = arrayOf(R.drawable.background_about ,R.drawable.background_about1)

        slideradapter = SliderAdapter(arrayOfImages)

        sliderview!!.setSliderAdapter(slideradapter!!)


        sliderview!!.setIndicatorAnimation(IndicatorAnimationType.WORM)

        bu_passer!!.setOnClickListener {
            startActivity(Intent(this ,InfoActivity::class.java))
        }
    }
}