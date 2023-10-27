package com.idn.doadandzikir.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.doadandzikir.adapter.DoaDanDzikirAdapter
import com.idn.doadandzikir.databinding.ActivityDzikirPagiBinding
import com.idn.doadandzikir.model.DataDoaDanDzikir

class DzikirPagiActivity : AppCompatActivity() {

    private var _binding: ActivityDzikirPagiBinding? = null
    private val binding get() = _binding as ActivityDzikirPagiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Dzikir Pagi"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        _binding = ActivityDzikirPagiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvDzikirPagi.apply {
            val mAdapter = DoaDanDzikirAdapter()
            mAdapter.setData(DataDoaDanDzikir.listDzikirPagi)
            adapter = mAdapter
            layoutManager = LinearLayoutManager(applicationContext)
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