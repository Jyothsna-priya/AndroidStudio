package com.example.dbsfragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragments.BlueFragment
import com.example.fragments.R

class RedFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var view = inflater.inflate(R.layout.activity_red, container, false)
        var redBut = view.findViewById<Button>(R.id.buttonred)
        redBut.setOnClickListener {
            var blueFrag = BlueFragment()
            var bundle = Bundle()
            bundle.putString("key", "Jyo")
            blueFrag.arguments = bundle

            fragmentManager?.beginTransaction()?.replace(R.id.mydynamiclayout, blueFrag)?.addToBackStack(null)?.commit()
        }

        return view
    }
}