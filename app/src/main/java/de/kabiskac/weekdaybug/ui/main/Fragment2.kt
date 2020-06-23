package de.kabiskac.weekdaybug.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import de.kabiskac.weekdaybug.R
import de.kabiskac.weekdaybug.databinding.Fragment2Binding

class Fragment2 : Fragment() {


    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding = DataBindingUtil.inflate<Fragment2Binding>(
            inflater,
            R.layout.fragment2, container, false
        )
        viewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)

        binding.lifecycleOwner = viewLifecycleOwner

        binding.button3.setOnClickListener {
            viewModel.setEnabled(true)
            findNavController().navigateUp()
        }

        binding.button4.setOnClickListener {
            viewModel.setEnabled(false)
            findNavController().navigateUp()
        }

        return binding.root
    }

}
