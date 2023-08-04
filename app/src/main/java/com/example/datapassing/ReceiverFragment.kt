package com.example.datapassing

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.datapassing.databinding.FragmentReceiverBinding


class ReceiverFragment : Fragment() {

    private lateinit var binding: FragmentReceiverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentReceiverBinding.inflate(inflater, container, false)

        binding.tvName.text= arguments?.getString("name")
        binding.tvNumber.text= arguments?.getString("number")




        return binding.root
    }

}