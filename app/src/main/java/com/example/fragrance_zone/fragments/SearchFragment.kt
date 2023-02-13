package com.example.fragrance_zone.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import com.example.fragrance_zone.base.BaseBottomTabFragment
import com.example.fragrance_zone.databinding.FragmentSearchBinding

class SearchFragment : BaseBottomTabFragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonDynamicTitleNavigate.setOnClickListener {
            navigateWithAction(
                SearchFragmentDirections.actionSearchFragmentToDynamicTitleFragment(
                    binding.editTextTitle.text.toString()
                )
            )
        }
    }

    class SearchFragmentDirections {
        companion object {
            fun actionSearchFragmentToDynamicTitleFragment(toString: String): NavDirections {
                TODO("Not yet implemented")
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}