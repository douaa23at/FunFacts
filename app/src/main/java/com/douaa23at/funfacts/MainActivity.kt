package com.douaa23at.funfacts

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    private var mFunFactTextView: TextView? = null
    private var showFunFactButton: Button? = null
    private var funFactBackground : RelativeLayout? = null
    private val funFacts = FunFacts()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mFunFactTextView = findViewById(R.id.funFact)
        showFunFactButton = findViewById(R.id.showFunFactButton)
        funFactBackground = findViewById(R.id.funFactBg)
        showFunFactButton!!.setOnClickListener{
            mFunFactTextView!!.text = funFacts.getFunFact()
            funFactBackground!!.setBackgroundColor(funFacts.getFunFactColor())
            showFunFactButton!!.setTextColor(funFacts.getFunFactColor())
        }
    }
}
