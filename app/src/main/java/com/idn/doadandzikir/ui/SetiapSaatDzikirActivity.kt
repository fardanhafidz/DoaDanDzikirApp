package com.idn.doadandzikir.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.doadandzikir.R
import com.idn.doadandzikir.adapter.DoaDanDzikirAdapter
import com.idn.doadandzikir.databinding.ActivitySetiapSaatDzikirBinding
import com.idn.doadandzikir.model.DataDoaDanDzikir

class SetiapSaatDzikirActivity : AppCompatActivity() {

    private var _binding: ActivitySetiapSaatDzikirBinding? = null
    private val binding get() = _binding as ActivitySetiapSaatDzikirBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        _binding = ActivitySetiapSaatDzikirBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mAdapter = DoaDanDzikirAdapter()
        mAdapter.setData(DataDoaDanDzikir.listDataDzikirSetiapSaat)
        binding.rvTxtDzikir.adapter = mAdapter
        binding.rvTxtDzikir.layoutManager = LinearLayoutManager(this)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        finish()
        return super.onSupportNavigateUp()
    }
}