package com.example.datapassing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import org.w3c.dom.Text


class ReceiverFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view:View= inflater.inflate(R.layout.fragment_receiver, container, false)
        val name=view.findViewById<TextView>(R.id.tvName)
        val number=view.findViewById<TextView>(R.id.tvNumber)
        val bundle = arguments
        val name1= bundle?.getString("name")
        val numb = bundle?.getString("number")
        name.text=name1
        number.text=numb
        return view
    }

}