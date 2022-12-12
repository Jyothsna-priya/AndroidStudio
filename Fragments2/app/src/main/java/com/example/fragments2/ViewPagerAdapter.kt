package com.example.fragments2

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter : FragmentPagerAdapter {
    private final var flist1: ArrayList<Fragment> =ArrayList()
    private final var fslist1:ArrayList<String> =ArrayList()

    public constructor(supportFragmentManager: FragmentManager)
            : super(supportFragmentManager)

    override fun getCount(): Int {
        return flist1.size
    }

    override fun getItem(position: Int): Fragment {
        return flist1.get(position)
    }

    fun addFragment(fragment: Fragment,title:String){
        flist1.add(fragment)
        fslist1.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fslist1.get(position)
    }
}