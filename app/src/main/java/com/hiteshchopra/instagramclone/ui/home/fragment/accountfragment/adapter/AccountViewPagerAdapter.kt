package com.hiteshchopra.instagramclone.ui.home.fragment.accountfragment.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class AccountViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {
    val fragmentList = mutableListOf<Fragment>()
    override fun getItemCount(): Int = fragmentList.size
    override fun createFragment(position: Int): Fragment = fragmentList[position]
}