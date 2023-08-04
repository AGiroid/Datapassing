package com.example.datapassing

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.datapassing.databinding.FragmentSenderBinding


class SenderFragment : Fragment() {

    private lateinit var senderFragment: FragmentSenderBinding
    private lateinit var medium: Medium
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View ?{
        senderFragment= FragmentSenderBinding.inflate(inflater, container, false)
        medium = requireActivity() as Medium
        senderFragment.btnpass.setOnClickListener {
            medium.passdata(senderFragment.edName.text.toString(),senderFragment.edNumber.text.toString())
        }
        return senderFragment.root
    }

}