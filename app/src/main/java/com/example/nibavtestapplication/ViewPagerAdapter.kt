package com.example.nibavtestapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter


private const val NUM_OF_TAB = 3

class ViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return NUM_OF_TAB
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> AllNewsFragment()
            1 -> FollowingFragment()
            2 -> ResourceCenterFragment()
            else -> AllNewsFragment()
        }
    }
}