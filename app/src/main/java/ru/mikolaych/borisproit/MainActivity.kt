package ru.mikolaych.borisproit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import ru.mikolaych.borisproit.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.regButton.setOnClickListener(this)
        binding.alreadyReg.setOnClickListener(this)


    }

    override fun onClick(view: View) {
        when(view.id){
            R.id.regButton ->{
                val intent = Intent(this, RegActivity::class.java)
                startActivity(intent)
            }
            R.id.alreadyReg ->{
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}