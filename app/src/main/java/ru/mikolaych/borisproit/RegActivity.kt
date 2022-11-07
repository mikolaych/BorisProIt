package ru.mikolaych.borisproit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.mikolaych.borisproit.databinding.ActivityRegBinding

class RegActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRegBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}