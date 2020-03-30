package com.example.rememberfy

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class ActivityPlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity__play)
        var showCards = findViewById(R.id.layoutCards) as ConstraintLayout
        var hideCards = findViewById(R.id.layoutCardsHide) as ConstraintLayout
        var cupcakehide1 = findViewById(R.id.cupcakehide1) as ImageView
        var cupcakehide2 = findViewById(R.id.cupcakehide2) as ImageView
        var marshmallowhide1 = findViewById(R.id.marhsmallowhide1) as ImageView
        var marshmallowhide2 = findViewById(R.id.marhsmallowhide2) as ImageView
        var androidhide1 = findViewById(R.id.androidhide1) as ImageView
        var androidhide2 = findViewById(R.id.androidhide2) as ImageView
        var jenhide1 = findViewById(R.id.jenhide1) as ImageView
        var jenhide2 = findViewById(R.id.jenhide2) as ImageView
        var jellyhide1 = findViewById(R.id.jellyhide1) as ImageView
        var jellyhide2 = findViewById(R.id.jellyhide2) as ImageView
        var oreohide1 = findViewById(R.id.oreohide1) as ImageView
        var oreohide2 = findViewById(R.id.oreohide2) as ImageView
        var lollipophide1 = findViewById(R.id.lollipophide1) as ImageView
        var lollipophide2 = findViewById(R.id.lollipophide2) as ImageView
        var piehide1 = findViewById(R.id.piehide1) as ImageView
        var piehide2 = findViewById(R.id.piehide2) as ImageView
        Handler().postDelayed({
            showCards.setVisibility(View.INVISIBLE)
            hideCards.setVisibility(View.VISIBLE)
        }, 7000)
        cupcakehide1.setOnClickListener{
            cupcakehide1.setImageResource(R.drawable.card_cupcake)
        }
        cupcakehide2.setOnClickListener{
            cupcakehide2.setImageResource(R.drawable.card_cupcake)
        }
        marshmallowhide1.setOnClickListener{
            marshmallowhide1.setImageResource(R.drawable.card_marshmallow)
        }
        marshmallowhide2.setOnClickListener{
            marshmallowhide2.setImageResource(R.drawable.card_marshmallow)
        }
        androidhide1.setOnClickListener{
            androidhide1.setImageResource(R.drawable.card_android)
        }
        androidhide2.setOnClickListener{
            androidhide2.setImageResource(R.drawable.card_android)
        }
        jenhide1.setOnClickListener{
            jenhide1.setImageResource(R.drawable.card_jen)
        }
        jenhide2.setOnClickListener{
            jenhide2.setImageResource(R.drawable.card_jen)
        }
        jellyhide1.setOnClickListener{
            jellyhide1.setImageResource(R.drawable.card_jelly)
        }
        jellyhide2.setOnClickListener{
            jellyhide2.setImageResource(R.drawable.card_jelly)
        }
        oreohide1.setOnClickListener{
            oreohide1.setImageResource(R.drawable.card_oreo)
        }
        oreohide2.setOnClickListener{
            oreohide2.setImageResource(R.drawable.card_oreo)
        }
        lollipophide1.setOnClickListener{
            lollipophide1.setImageResource(R.drawable.card_lollipop)
        }
        lollipophide2.setOnClickListener{
            lollipophide2.setImageResource(R.drawable.card_lollipop)
        }
        piehide1.setOnClickListener{
            piehide1.setImageResource(R.drawable.card_pie)
        }
        piehide2.setOnClickListener{
            piehide2.setImageResource(R.drawable.card_pie)
        }
    }
}
