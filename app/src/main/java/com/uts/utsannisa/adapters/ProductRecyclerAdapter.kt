package com.uts.utsannisa.adapters

import android.view.LayoutInflater
import androidx.databinding.ViewDataBinding
import com.uts.utsannisa.BR
import com.uts.utsannisa.GenericRecyclerAdapter
import com.uts.utsannisa.models.Product

open class ProductRecyclerAdapter<GenericViewBinding : ViewDataBinding>(
    layoutInflater: LayoutInflater, list: List<Product?>?, itemLayoutRes: Int
) :
    GenericRecyclerAdapter<GenericViewBinding, Product>(
        layoutInflater, list, itemLayoutRes, BR.product
    )