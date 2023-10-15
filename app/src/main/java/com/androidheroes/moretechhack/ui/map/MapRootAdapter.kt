package com.androidheroes.moretechhack.ui.map

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class MapRootAdapter(fragment: Fragment, private val itemsCount: Int) :
    FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return itemsCount
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                MapFragment.newInstance("", "")
            }
            1 -> {
                AddressesFragment.newInstance("", "")
            }
            else -> TODO()
        }
    }
}
