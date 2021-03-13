package com.gayedirican.ennurgayedirican_odev2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

@Suppress("UNREACHABLE_CODE")
class MainActivity() : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val zar = Zar(findViewById(R.id.zar1Image), findViewById(R.id.zar2Image), findViewById(R.id.zaratButton), findViewById(R.id.temizleButton))
        zar.zaratButton.setOnClickListener {
            val randomSayi1 = (1..6).shuffled().last()
            var randomSayi2 = (1..6).shuffled().last()
            if(randomSayi1==randomSayi2){
                randomSayi2 = (1..6).shuffled().last()
            }
            Toast.makeText(applicationContext,"ZAR ATILDI!", Toast.LENGTH_SHORT).show()


            when(randomSayi1){
                1 -> zar.zar1Image.setImageResource(R.drawable.dice_1)
                2 -> zar.zar1Image.setImageResource(R.drawable.dice_2)
                3 -> zar.zar1Image.setImageResource(R.drawable.dice_3)
                4 -> zar.zar1Image.setImageResource(R.drawable.dice_4)
                5 -> zar.zar1Image.setImageResource(R.drawable.dice_5)
                6 -> zar.zar1Image.setImageResource(R.drawable.dice_6)
            }
            when(randomSayi2){
                1 -> zar.zar2Image.setImageResource(R.drawable.dice_1)
                2 -> zar.zar2Image.setImageResource(R.drawable.dice_2)
                3 -> zar.zar2Image.setImageResource(R.drawable.dice_3)
                4 -> zar.zar2Image.setImageResource(R.drawable.dice_4)
                5 -> zar.zar2Image.setImageResource(R.drawable.dice_5)
                6 -> zar.zar2Image.setImageResource(R.drawable.dice_6)
            }
        }

        zar.temizleButton.setOnClickListener {
            Toast.makeText(applicationContext,"TEMIZLENDI!", Toast.LENGTH_SHORT).show()
            zar.zar1Image.setImageResource((R.drawable.empty_dice))
            zar.zar2Image.setImageResource((R.drawable.empty_dice))
        }
    }

}
class Zar(var zar1Image: ImageView, var zar2Image: ImageView, var zaratButton: Button, var temizleButton: Button)
