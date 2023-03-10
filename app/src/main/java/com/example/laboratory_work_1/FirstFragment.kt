package com.example.laboratory_work_1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.laboratory_work_1.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentFirstBinding


    // private lateinit var binding: FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(layoutInflater)
        val view=binding.root

        binding.button1.setOnClickListener{
            binding.textView1.text="Hello from button1!"
            Toast.makeText(getActivity(),"Нажата кнопка1.",Toast.LENGTH_SHORT).show()
        }

        binding.button2.setOnClickListener{
            binding.textView2.text="Hello from button2!"
            Toast.makeText(getActivity(),"Нажата кнопка2.",Toast.LENGTH_SHORT).show()
        }

//        val view=inflater.inflate(R.layout.fragment_first,container,false)
//
//
//        val textView1:TextView = view.findViewById(R.id.textView1)
//        val textView2:TextView = view.findViewById(R.id.textView2)
//
//        val button1:Button=view.findViewById(R.id.button1)
//        val button2:Button=view.findViewById(R.id.button2)
//
//        button1.setOnClickListener(){
//            textView1.text="Hello from button1!"
//            Toast.makeText(getActivity(),"Нажата кнопка1.",Toast.LENGTH_SHORT).show()
//        }
//
//        button2.setOnClickListener(){
//            textView2.text="Hello from button2!"
//            Toast.makeText(getActivity(),"Нажата кнопка2.",Toast.LENGTH_SHORT).show()
//        }
//
//        return view//inflater.inflate(R.layout.fragment_first, container, false)
        return view
    }

    companion object {
        @JvmStatic


        fun newInstance() = FirstFragment()
    }
}