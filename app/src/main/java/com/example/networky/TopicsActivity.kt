package com.example.networky

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.networky.databinding.ActivityTopicsBinding

class TopicsActivity : AppCompatActivity() {

    lateinit var binding:ActivityTopicsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopicsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var counter = 1

        binding.buToHome.setOnClickListener {
            if (counter == 5)
            {

                startActivity(Intent(this ,MainActivity::class.java))
            }
        }

        var a = true
        binding.tWriting.setOnClickListener {

            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (a)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tWriting.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textW.setTextColor(Color.WHITE)
                a = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tWriting.setBackgroundResource(R.drawable.bg_topic)
                binding.textW.setTextColor(Color.BLACK)
                a = true
            }
        }

        var b = true
        binding.tCommerce.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (b)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tCommerce.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textCommerce.setTextColor(Color.WHITE)
                b = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tCommerce.setBackgroundResource(R.drawable.bg_topic)
                binding.textCommerce.setTextColor(Color.BLACK)
                b = true
            }
        }

        var c = true
        binding.tCode.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (c)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tCode.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textCode.setTextColor(Color.WHITE)
                c = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tCode.setBackgroundResource(R.drawable.bg_topic)
                binding.textCode.setTextColor(Color.BLACK)
                c = true
            }
        }

        var d = true
        binding.tMusic.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (d)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tMusic.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textMusic.setTextColor(Color.WHITE)
                d = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tMusic.setBackgroundResource(R.drawable.bg_topic)
                binding.textMusic.setTextColor(Color.BLACK)
                d = true
            }
        }

        var e = true
        binding.tAi.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (e)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tAi.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textAi.setTextColor(Color.WHITE)
                e = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tAi.setBackgroundResource(R.drawable.bg_topic)
                binding.textAi.setTextColor(Color.BLACK)
                e = true
            }
        }

        var f = true
        binding.tSports.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (f)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tSports.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textSports.setTextColor(Color.WHITE)
                f = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tSports.setBackgroundResource(R.drawable.bg_topic)
                binding.textSports.setTextColor(Color.BLACK)
                f = true
            }
        }

        var g = true
        binding.tGaming.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (g)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tGaming.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textGaming.setTextColor(Color.WHITE)
                g = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tGaming.setBackgroundResource(R.drawable.bg_topic)
                binding.textGaming.setTextColor(Color.BLACK)
                g = true
            }
        }

        var h = true
        binding.tNews.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (h)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tNews.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textNews.setTextColor(Color.WHITE)
                h = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tNews.setBackgroundResource(R.drawable.bg_topic)
                binding.textNews.setTextColor(Color.BLACK)
                h = true
            }
        }

        var i = true
        binding.tTravel.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (i)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tTravel.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textTravel.setTextColor(Color.WHITE)
                i = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tTravel.setBackgroundResource(R.drawable.bg_topic)
                binding.textTravel.setTextColor(Color.BLACK)
                i = true
            }
        }

        var j = true
        binding.tAi1.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (j)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tAi1.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textAi1.setTextColor(Color.WHITE)
                j = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tAi1.setBackgroundResource(R.drawable.bg_topic)
                binding.textAi1.setTextColor(Color.BLACK)
                j = true
            }
        }

        var k = true
        binding.tArt.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (k)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tArt.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textArt.setTextColor(Color.WHITE)
                k = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tArt.setBackgroundResource(R.drawable.bg_topic)
                binding.textArt.setTextColor(Color.BLACK)
                k = true
            }
        }

        var l = true
        binding.tAnimals.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (l)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tAnimals.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textAnimals.setTextColor(Color.WHITE)
                l = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tAnimals.setBackgroundResource(R.drawable.bg_topic)
                binding.textAnimals.setTextColor(Color.BLACK)
                l = true
            }
        }

        var m = true
        binding.tNature.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (m)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tNature.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textNature.setTextColor(Color.WHITE)
                m = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tNature.setBackgroundResource(R.drawable.bg_topic)
                binding.textNature.setTextColor(Color.BLACK)
                m = true
            }
        }

        var n = true
        binding.tHealt.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (n)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tHealt.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textHealt.setTextColor(Color.WHITE)
                n = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tHealt.setBackgroundResource(R.drawable.bg_topic)
                binding.textHealt.setTextColor(Color.BLACK)
                n = true
            }
        }

        var o = true
        binding.tFunny.setOnClickListener {
            if (counter == 5)
            {
                binding.textCounter.setText("5/5 choisi")
                binding.buToHome.setCardBackgroundColor(Color.parseColor("#582FFF"))
                return@setOnClickListener
            }
            if (o)
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter++
                binding.tFunny.setBackgroundResource(R.drawable.bg_topic_selected)
                binding.textFunny.setTextColor(Color.WHITE)
                o = false
            }
            else
            {
                binding.textCounter.setText("${counter}/5 choisi")
                counter--
                binding.tFunny.setBackgroundResource(R.drawable.bg_topic)
                binding.textFunny.setTextColor(Color.BLACK)
                o = true
            }
        }
    }
}