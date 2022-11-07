package ru.mikolaych.borisproit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import ru.mikolaych.borisproit.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.forgotPassBut.setOnClickListener(this)
    }

    override fun onClick(view: View) {
       when(view.id){
           R.id.forgotPassBut -> {
               TODO()
           }
       }
    }
}