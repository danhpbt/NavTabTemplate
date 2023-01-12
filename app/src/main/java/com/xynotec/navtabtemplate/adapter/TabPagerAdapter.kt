package com.xynotec.navtabtemplate.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.xynotec.navtabtemplate.data.model.TabItem

class TabPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle,
                      val tabs: List<Fragment>,
                      val tabItems: List<TabItem>) :
    FragmentStateAdapter(fragmentManager, lifecycle){

    override fun getItemCount(): Int {
        return tabs.size
    }

    override fun createFragment(position: Int): Fragment {
        return tabs[position]
    }
}