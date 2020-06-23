package de.kabiskac.weekdaybug.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import de.kabiskac.weekdaybug.R
import de.kabiskac.weekdaybug.databinding.Fragment1Binding
import de.kabiskac.weekdaybug.databinding.Fragment2Binding

class Fragment1 : Fragment() {


    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val binding = DataBindingUtil.inflate<Fragment1Binding>(
            inflater,
            R.layout.fragment1, container, false
        )
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.viewmodel = viewModel

        binding.lifecycleOwner = viewLifecycleOwner

        binding.navigateBtn.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_fragment2)
        }

/*
        //it doesn't matter if I do it like this or with binding adapter
        viewModel.enabled.observe(viewLifecycleOwner, Observer {
            if (it) {
                binding.materialDayPicker.enableAllDays()
            }
            else {
                binding.materialDayPicker.apply {
                    disableAllDays()
                    deselectAllDays()
                }
            }
        })*/

        return binding.root
    }

}