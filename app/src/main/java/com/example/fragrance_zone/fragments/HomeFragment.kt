package com.example.fragrance_zone.fragments

import android.os.Bundle
import android.os.CountDownTimer
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.fragrance_zone.databinding.FragmentHomeBinding
import com.example.fragrance_zone.R
import com.faskn.trickynavigationsample.utils.TimerFormatter

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    val timerTotal = 1200000L // 20 Min
    lateinit var timer: CountDownTimer

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)





    }

    override fun onDestroyView() {
        super.onDestroyView()

        _binding = null
    }
}
