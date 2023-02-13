package com.example.fragrance_zone.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavDirections
import com.example.fragrance_zone.base.BaseBottomTabFragment
import com.example.fragrance_zone.databinding.FragmentGamesBinding

class GamesFragment : BaseBottomTabFragment() {

    private var _binding: FragmentGamesBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentGamesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonReplaceFragment.setOnClickListener {
            navigateWithAction(
                GamesFragmentDirections.actionGamesFragmentToDynamicTitleFragment(
                    "Replace"
                )
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

class GamesFragmentDirections {
    companion object {
        fun actionGamesFragmentToDynamicTitleFragment(s: String): NavDirections {
            TODO("Not yet implemented")
        }
    }

}
