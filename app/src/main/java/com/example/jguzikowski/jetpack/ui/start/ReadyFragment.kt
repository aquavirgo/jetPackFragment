package com.example.jguzikowski.jetpack.ui.start


import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.jguzikowski.jetpack.R

class ReadyFragment : Fragment() {

    companion object {
        fun newInstance() = ReadyFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("TAG","Przelaczone")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater?.inflate(R.layout.ready_fragment, container, false)
    }





}