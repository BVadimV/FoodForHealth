package com.vadim.healingfood.ui.activity.main

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vadim.healingfood.R

class MainActivity : BaseActivity() {

    companion object {
        fun getIntent(context: Context?) = Intent(context, MainActivity::class.java)
    }

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

//    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        viewModel = getViewModel(MainViewModel::class.java)

        binding.viewModel = viewModel
    }

}