package com.example.hw10_q1

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.hw10_q1.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
        //inflater.inflate(R.layout.fragment_first, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

     //   val user=User(FullName,userName,email,password,gender2)


        binding.buttonSave.setOnClickListener {
          Toast.makeText(activity,"send",Toast.LENGTH_LONG).show()
            val FullName = binding.FullName.text.toString()
            val password = binding.password.text.toString()
            val email = binding.emailuser.text.toString()
            val userName = binding.userName.text.toString()
            var gender2: String = ""
            if (binding.radioWomen.isChecked == true) {
                gender2 = "women"
            } else if (binding.buttonMen.isChecked == true) {
                gender2 = "men"
            }

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(userName,FullName,password,email,gender2)
            findNavController().navigate(action)

        }






//            val sharedPreferences =requireActivity().getSharedPreferences("myInformation",
//                Context.MODE_PRIVATE
//            )
//            val usernameValue = sharedPreferences.getString("username", "")
//            val codeMelliValue=sharedPreferences.getString("codeMelli", "")
//            val city=sharedPreferences.getString("city", "")
//            val address=sharedPreferences.getString("address", "")
//            val gender=sharedPreferences.getString("gender","")
//            binding.FullName.setText("نام و نام خانوادگی:  "+usernameValue)
//            binding.userName.setText("کد ملی:  "+codeMelliValue)
//            binding.emailuser.setText("  شهر:  "+city)
//            binding.password.setText("آدرس:  "+address)
//

        }

    }


