package com.idn.doadandzikir.ui.detail

import android.os.Build.VERSION.SDK_INT
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.idn.doadandzikir.R
import com.idn.doadandzikir.databinding.ActivityDetailArtikelBinding
import com.idn.doadandzikir.model.Artikel

class DetailArtikelActivity : AppCompatActivity() {

    private var _binding: ActivityDetailArtikelBinding? = null
    private val binding get() = _binding as ActivityDetailArtikelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        title = "Artikel Islam"
        super.onCreate(savedInstanceState)
        _binding = ActivityDetailArtikelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = when {
            SDK_INT >= 33 -> intent.getParcelableExtra("data", Artikel::class.java)
            else -> @Suppress("DEPRECATION") intent.getParcelableExtra("key") as? Artikel
        }

        binding.apply {
            data?.imageArticle?.let { imgDetail.setImageResource(it) }
            tvDetailTitle.text = data?.titleArticle
            tvDetailDesc.text = data?.descArticle
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