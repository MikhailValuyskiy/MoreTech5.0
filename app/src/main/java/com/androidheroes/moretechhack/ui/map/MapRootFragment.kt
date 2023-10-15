package com.androidheroes.moretechhack.ui.map

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.androidheroes.moretechhack.R
import com.androidheroes.moretechhack.databinding.FragmentMapBinding
import com.androidheroes.moretechhack.databinding.FragmentMapRootBinding
import com.google.android.material.tabs.TabLayoutMediator

class MapRootFragment : Fragment() {

    private lateinit var mapRootTabLayoutTitles: Array<String>

    private var _binding: FragmentMapRootBinding? = null
    private val binding get() = _binding!!

    private var profilePageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMapRootBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mapRootTabLayoutTitles = resources.getStringArray(R.array.map_tab_titles)

        binding.mapViewPager.isUserInputEnabled = false;

        val profileAdapter = MapRootAdapter(
            this,
            mapRootTabLayoutTitles.size
        )
        binding.mapViewPager.adapter = profileAdapter

        binding.mapViewPager.registerOnPageChangeCallback(profilePageChangeCallback)

        TabLayoutMediator(binding.tabLayout, binding.mapViewPager) { tab, position ->

            val title =  mapRootTabLayoutTitles[position]


            tab.text = title
        }.attach()
    }
}
