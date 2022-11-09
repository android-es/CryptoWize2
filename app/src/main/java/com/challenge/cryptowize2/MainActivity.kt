package com.challenge.cryptowize2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.challenge.cryptowize2.databinding.ActivityMainBinding

//@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}