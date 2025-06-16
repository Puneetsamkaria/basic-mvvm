package com.example.mvvmfirstcalculator.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmfirstcalculator.databinding.ActivityMainBinding
import com.example.mvvmfirstcalculator.viewmodel.calculatorviewmodel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: calculatorviewmodel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)  // ✅ Correct way to set view when using ViewBinding

        viewModel = ViewModelProvider(this)[calculatorviewmodel::class.java]

        binding.calculate.setOnClickListener {
            val num1 = binding.num1.text.toString().toIntOrNull() ?: 0
            val num2 = binding.num2.text.toString().toIntOrNull() ?: 0
            val sum = viewModel.calculatesum(num1, num2)
            binding.result.text = sum.toString()
        }
    }
}
