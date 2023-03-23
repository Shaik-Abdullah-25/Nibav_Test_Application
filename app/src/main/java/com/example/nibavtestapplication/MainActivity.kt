package com.example.nibavtestapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import com.example.nibavtestapplication.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var navController : NavController

    private var navTabs = arrayListOf("All News" , "Following" , "Resource Center")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setUpTabViewPager()
    }

    private fun setUpTabViewPager() {

        val tabMenu = binding.tabMenu
        val viewMenu = binding.viewMenu
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        viewMenu.adapter = viewPagerAdapter
        TabLayoutMediator(tabMenu , viewMenu){
            tab , position -> tab.text = navTabs[position]
        }.attach()

    }
}