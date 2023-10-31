package com.descritas.dnd6charactersapp.activity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.descritas.dnd6charactersapp.adapter.PagerAdapter
import com.descritas.dnd6charactersapp.databinding.FragmentPageBinding
import com.google.android.material.tabs.TabLayout


class PageFragment : Fragment() {
    private lateinit var viewPager: ViewPager
    private lateinit var tabLayout: TabLayout
    private lateinit var pagerAdapter: PagerAdapter
    lateinit var binding: FragmentPageBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPageBinding.inflate(
            inflater,
            container,
            false
        )
        viewPager = binding.viewPager
        tabLayout = binding.tabLayout
        pagerAdapter = PagerAdapter(childFragmentManager)

        viewPager.adapter = pagerAdapter
        tabLayout.setupWithViewPager(viewPager)

        return binding.root
    }
}
