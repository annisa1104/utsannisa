package com.uts.utsannisa.adapters

import android.view.LayoutInflater
import com.uts.utsannisa.R
import com.uts.utsannisa.databinding.ItemMenuLayoutView
import com.uts.utsannisa.models.Product

class MenuRecyclerAdapter(layoutInflater: LayoutInflater, list: List<Product?>?) :
    ProductRecyclerAdapter<ItemMenuLayoutView>(layoutInflater, list, R.layout.item_menu)