package com.uts.utsannisa.adapters

import android.view.LayoutInflater
import com.uts.utsannisa.BR
import com.uts.utsannisa.GenericRecyclerAdapter
import com.uts.utsannisa.R
import com.uts.utsannisa.databinding.ItemPriceVariantLayoutView
import com.uts.utsannisa.models.PriceVariant

class PriceRecyclerAdapter(layoutInflater: LayoutInflater, list: List<PriceVariant?>?) :
    GenericRecyclerAdapter<ItemPriceVariantLayoutView, PriceVariant>(
        layoutInflater, list, R.layout.item_price_variant, BR.priceVariant
    )