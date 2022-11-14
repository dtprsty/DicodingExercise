package com.dtp.customview

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import com.dtp.customview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initAction()
    }

    private fun initAction() {
        binding.apply {
            customEt.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    //Do nothing
                }

                override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                    setButtonEnabled()
                }

                override fun afterTextChanged(p0: Editable?) {
                    //Do nothing
                }
            })

            customBtn.setOnClickListener { showToast(customEt.text.toString()) }
        }
    }

    private fun setButtonEnabled() {
        binding.apply {
            val result = customEt.text
            customBtn.isEnabled = !result.toString().isNullOrEmpty()
        }
    }
}