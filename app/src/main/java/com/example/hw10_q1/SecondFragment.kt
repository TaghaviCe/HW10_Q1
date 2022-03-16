package com.example.hw10_q1

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.example.hw10_q1.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    lateinit var sharedPreferences: SharedPreferences
    private val args : SecondFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
        //inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.viewUserName.text=args.username
        binding.viewName.text=args.fullName
        binding.viewEmail.text=args.email
        binding.viewpassword.text=args.password
        binding.viewgender.text=args.gender

        val sharedPreferences: SharedPreferences =
            this.requireActivity().getSharedPreferences("myInformation", Context.MODE_PRIVATE)
        binding.save.setOnClickListener {
            var name1=binding.viewName.text.toString()
            var username1= binding.viewUserName.text.toString()
            var email1= binding.viewEmail.text.toString()
            var password1= binding.viewpassword.text.toString()
            var gender=binding.viewgender.text.toString()
            val editor: SharedPreferences.Editor = sharedPreferences.edit()
            editor.putString("name", name1)
            editor.putString("username", username1)
            editor.putString("email", email1)
            editor.putString("password", password1)
            editor.putString("gender", gender)
            editor.apply()
            editor.commit()
            Toast.makeText(activity, "your information was saved!", Toast.LENGTH_SHORT).show()


        }
    }


    }
