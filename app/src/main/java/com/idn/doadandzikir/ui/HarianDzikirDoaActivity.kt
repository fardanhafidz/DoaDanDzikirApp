package com.idn.doadandzikir.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.idn.doadandzikir.R
import com.idn.doadandzikir.adapter.DoaDanDzikirAdapter
import com.idn.doadandzikir.databinding.ActivityHarianDzikirDoaBinding
import com.idn.doadandzikir.model.DoaDanDzikirItem

class HarianDzikirDoaActivity : AppCompatActivity() {

    private var _binding: ActivityHarianDzikirDoaBinding? = null
    private val binding get() = _binding as ActivityHarianDzikirDoaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        _binding = ActivityHarianDzikirDoaBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        providingDzikirData()
        initView()
    }

    private fun providingDzikirData(): List<DoaDanDzikirItem> {

        val titleDoa = resources.getStringArray(R.array.arr_dzikir_doa_harian)
        val lafadzDoa = resources.getStringArray(R.array.arr_lafaz_dzikir_doa_harian)
        val translatedDoa = resources.getStringArray(R.array.arr_terjemah_dzikir_doa_harian)

        val listData = arrayListOf<DoaDanDzikirItem>()
        for (index in titleDoa.indices) {
            val data = DoaDanDzikirItem(
                titleDoa[index],
                lafadzDoa[index],
                translatedDoa[index],
            )
            listData.add(data)
        }
        return listData
    }

    private fun initView() {
        val mAdapter = DoaDanDzikirAdapter()
        mAdapter.setData(providingDzikirData())

        binding.rvDzikirDoaHarian.adapter = mAdapter
        binding.rvDzikirDoaHarian.layoutManager = LinearLayoutManager(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        finish()
        return super.onSupportNavigateUp()
    }
}