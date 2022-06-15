package com.example.tarea02.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tarea02.databinding.FragmentTarea02Binding
import com.example.tarea02.viewmodel.Tarea02ViewModel

class Tarea02Fragment : Fragment() {

    private var _binding: FragmentTarea02Binding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val tarea02ViewModel =
            ViewModelProvider(this).get(Tarea02ViewModel::class.java)

        _binding = FragmentTarea02Binding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        tarea02ViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}