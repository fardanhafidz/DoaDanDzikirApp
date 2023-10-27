package com.idn.doadandzikir.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import com.idn.doadandzikir.R
import com.idn.doadandzikir.databinding.ActivityPagiPetangDzikirBinding
import com.idn.doadandzikir.ui.detail.DzikirPagiActivity
import com.idn.doadandzikir.ui.detail.DzikirPetangActivity

class PagiPetangDzikirActivity : AppCompatActivity(), View.OnClickListener {

    private var _binding: ActivityPagiPetangDzikirBinding? = null
    private val binding get() = _binding as ActivityPagiPetangDzikirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        _binding = ActivityPagiPetangDzikirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val btnPagi = findViewById<ImageButton>(R.id.img_btn_dzikir_pagi)
        val btnPetang = findViewById<ImageButton>(R.id.img_btn_dzikir_petang)

        btnPagi.setOnClickListener(this)
        btnPetang.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.img_btn_dzikir_pagi -> startActivity(
                Intent(
                    this, DzikirPagiActivity::class.java
                )
            )

            R.id.img_btn_dzikir_petang -> startActivity(
                Intent(
                    this, DzikirPetangActivity::class.java
                )
            )
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        finish()
        return super.onSupportNavigateUp()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}