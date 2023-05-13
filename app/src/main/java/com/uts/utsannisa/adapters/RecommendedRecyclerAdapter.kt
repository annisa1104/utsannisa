package com.uts.utsannisa.adapters

import android.view.LayoutInflater
import com.uts.utsannisa.R
import com.uts.utsannisa.databinding.ItemRecommendedLayoutView
import com.uts.utsannisa.models.Product

class RecommendedRecyclerAdapter(layoutInflater: LayoutInflater, list: List<Product?>?) :
    ProductRecyclerAdapter<ItemRecommendedLayoutView>(
        layoutInflater, list, R.layout.item_recommended
    ) {

    override
    fun bind(viewBinding: ItemRecommendedLayoutView, genericData: Product?) {
        super.bind(viewBinding, genericData)
        viewBinding.priceAdapter = PriceRecyclerAdapter(layoutInflater, genericData?.priceList)
    }

}