package com.idn.doadandzikir.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.doadandzikir.adapter.DoaDanDzikirAdapter
import com.idn.doadandzikir.databinding.ActivityDzikirPetangBinding
import com.idn.doadandzikir.model.DataDoaDanDzikir

class DzikirPetangActivity : AppCompatActivity() {

    private var _binding: ActivityDzikirPetangBinding? = null
    private val binding get() = _binding as ActivityDzikirPetangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Dzikir Petang"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        _binding = ActivityDzikirPetangBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvDzikirPetang.apply {
            val mAdapter = DoaDanDzikirAdapter()
            mAdapter.setData(DataDoaDanDzikir.listDzikirPetang)
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