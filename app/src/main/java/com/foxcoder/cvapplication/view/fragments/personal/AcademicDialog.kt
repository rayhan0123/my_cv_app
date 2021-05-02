package com.foxcoder.cvapplication.view.fragments.personal

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.foxcoder.cvapplication.R
import com.foxcoder.cvapplication.databinding.FragmentAcademicBinding
import com.foxcoder.cvapplication.view.base_classes.BaseDialogFragment


class AcademicDialog : BaseDialogFragment() {

    private var _binding: FragmentAcademicBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAcademicBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}