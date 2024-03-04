package com.example.bmi

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var tfWeight : TextView = findViewById(R.id.weight)
        var tfHeight : TextView = findViewById(R.id.tfHeight)
        var btn : Button = findViewById(R.id.btnSubmit)
        var imgResult : ImageView = findViewById(R.id.img)

        btn.setOnClickListener(){
            var weight : Double = tfWeight.text.toString().toDouble()
            var height : Double = tfHeight.text.toString().toDouble()
            var bmi = weight/height * height

            if(bmi < 18.5){

                imgResult.setImageResource(R.drawable.under)

            }
            else if (bmi >= 18.5 && bmi <= 25.9){
            imgResult.setImageResource(R.drawable.normal)
    }else
            {
            imgResult.setImageResource(R.drawable.over)
            }
            }
        }

}