package com.idn.doadandzikir.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.doadandzikir.adapter.DoaDanDzikirAdapter
import com.idn.doadandzikir.databinding.ActivityQauliyahShalatBinding
import com.idn.doadandzikir.model.DataDoaDanDzikir

class QauliyahShalatActivity : AppCompatActivity() {

    private var _binding: ActivityQauliyahShalatBinding? = null
    private val binding get() = _binding as ActivityQauliyahShalatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        _binding = ActivityQauliyahShalatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mAdapter = DoaDanDzikirAdapter()
        mAdapter.setData(DataDoaDanDzikir.listDataQauliyyah)
        binding.rvTxtQauliyah.adapter = mAdapter
        binding.rvTxtQauliyah.layoutManager = LinearLayoutManager(this)
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