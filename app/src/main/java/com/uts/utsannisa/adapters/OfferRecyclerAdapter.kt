package com.uts.utsannisa.adapters

import android.view.LayoutInflater
import com.uts.utsannisa.R
import com.uts.utsannisa.databinding.ItemOfferLayoutView
import com.uts.utsannisa.models.Product

class OfferRecyclerAdapter(layoutInflater: LayoutInflater, list: List<Product?>?) :
    ProductRecyclerAdapter<ItemOfferLayoutView>(layoutInflater, list, R.layout.item_offer)