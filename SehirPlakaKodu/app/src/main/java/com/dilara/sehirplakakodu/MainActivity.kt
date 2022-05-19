package com.dilara.sehirplakakodu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.dilara.sehirplakakodu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivitMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(LayoutInflater)
        setContentView(R.layout.activity_main)
        binding.button.setOnClickListener{
            if(binding.editTextNumber.text.isNootEmpty()){
                var plakaKodu=binding.editTextNumber.text.toString().toInt()
                when(plakaKodu){
                    35 -> binding.textView.text="İzmir"
                    39 -> binding.textView.text="Kırklareli"
                    34 -> binding.textView.text="İstanbul"
                    41 -> binding.textView.text="İzmit"
                    6 -> binding.textView.text="Ankara"
                    22 -> binding.textView.text="Edirne"
                    else ->{
                        binding.textView.text="Bulunamadı"
                    }
                }

            }
            else{
                binding.textView.text="şehir plaka kodu girin"
            }
            binding.editTextNumber.text.clear()
        }

    }
}