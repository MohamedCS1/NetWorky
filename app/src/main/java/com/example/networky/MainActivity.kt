package com.example.networky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.networky.Fragments.FavorisFragment
import com.example.networky.Fragments.GroupesFragment
import com.example.networky.Fragments.HomeFragment
import com.example.networky.Fragments.ProfilFragment
import com.gauravk.bubblenavigation.BubbleNavigationLinearView
import com.gauravk.bubblenavigation.listener.BubbleNavigationChangeListener
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val bubbleNav = findViewById<BubbleNavigationLinearView>(R.id.bottom_navigation_view_linear)
        val fmi = supportFragmentManager
        val fti = fmi.beginTransaction()
        fti.replace(R.id.fragmentContainerView ,HomeFragment())
        fti.commit()
        bubbleNav!!.setNavigationChangeListener(object :BubbleNavigationChangeListener{
            override fun onNavigationChanged(view: View?, position: Int) {
                val fmi = supportFragmentManager
                val fti = fmi.beginTransaction()
                when(position)
                {
                    0 -> {
                        fti.replace(R.id.fragmentContainerView ,HomeFragment())
                        fti.commit()
                    }
                    1 -> {
                        fti.replace(R.id.fragmentContainerView ,GroupesFragment())
                        fti.commit()
                    }
                    2 -> {
                        fti.replace(R.id.fragmentContainerView ,FavorisFragment())
                        fti.commit()
                    }
                    3 -> {
                        fti.replace(R.id.fragmentContainerView ,ProfilFragment())
                        fti.commit()
                    }
                }
            }
        })
    }
}