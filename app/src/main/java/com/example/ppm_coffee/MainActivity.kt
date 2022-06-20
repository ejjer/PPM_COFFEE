package com.example.ppm_coffee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ppm_coffee.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var _binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        _binding =ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(_binding.root)
    }
}