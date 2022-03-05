package com.example.networky

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.networky.Fragments.SingUpFragment
import com.example.networky.R

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val fm = supportFragmentManager
        val ft = fm.beginTransaction()
        ft.replace(R.id.fragmentContainerView ,SingUpFragment())
        ft.commit()
    }
}