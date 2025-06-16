package com.example.mvvmfirstcalculator.viewmodel

import androidx.lifecycle.ViewModel

class calculatorviewmodel : ViewModel() {
    fun calculatesum(a: Int, b: Int): Int {
        return a + b

    }
}
