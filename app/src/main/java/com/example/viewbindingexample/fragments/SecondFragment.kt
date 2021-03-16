package com.example.viewbindingexample.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.viewbindingexample.R
import com.example.viewbindingexample.databinding.FragmentFirstBinding
import com.example.viewbindingexample.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.button.setOnClickListener {
            Toast.makeText(this.requireActivity(), binding.txtName.text, Toast.LENGTH_SHORT).show()
            Toast.makeText(this.requireActivity(), binding.txtHello.text, Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }


}