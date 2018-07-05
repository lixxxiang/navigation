package com.android.testnav

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.*

class FirstFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("TEST","OO")
            Navigation.findNavController(view).navigate(R.id.action_firstFragment_to_secondFragment,bundle)
//            Navigation.findNavController(activity!!, R.id.btn).navigate(R.id.action_firstFragment_to_secondFragment);
        }
    }
}
