package com.uts.utsannisa

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.uts.utsannisa.adapters.CategoryRecyclerAdapter
import com.uts.utsannisa.databinding.MainLayoutView
import com.uts.utsannisa.models.RestaurantMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mMainLayoutView: MainLayoutView =
            DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(mMainLayoutView.toolbar)
        val generateRestaurantMenu: RestaurantMenu = SampleData().generateRestaurantMenu()
        mMainLayoutView.header = generateRestaurantMenu.header
        mMainLayoutView.adapter =
            CategoryRecyclerAdapter(layoutInflater, generateRestaurantMenu.categoryList)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

}

