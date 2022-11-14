package com.dtp.ticketing_apss

import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity
import com.dtp.customview.showToast
import com.dtp.ticketing_apss.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        supportActionBar?.hide()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.apply {

            finishButton.setOnClickListener {
                seatView.seat?.let {
                    showToast("Kursi Anda nomor ${it.name}")
                } ?: run {
                    showToast("Silahkan pilih kursi terlebih dahulu")
                }
            }
        }
    }
}