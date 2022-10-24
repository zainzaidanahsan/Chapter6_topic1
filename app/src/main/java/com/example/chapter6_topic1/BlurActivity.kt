package com.example.chapter6_topic1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.chapter6_topic1.databinding.ActivityBlurBinding
import com.example.chapter6_topic1.databinding.ActivityMainBinding

class BlurActivity : AppCompatActivity() {
    lateinit var binding : ActivityBlurBinding
    private val viewModel:BlurViewModel by viewModels { BlurViewModelFactory(application) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlurBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.goButton.setOnClickListener {
            viewModel.applyBlur(3)
        }
    }
}