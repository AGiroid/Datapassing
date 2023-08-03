package com.example.datapassing

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name=findViewById<EditText>(R.id.edName)
        val number=findViewById<EditText>(R.id.edNumber)
        val pass=findViewById<Button>(R.id.btnpass)
        val mFragmentManager = supportFragmentManager
        val mFragmentTransaction = mFragmentManager.beginTransaction()
        val mFragment = ReceiverFragment()

        pass.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", name.text.toString())
            bundle.putString("number", number.text.toString())
            mFragment.arguments = bundle
            mFragmentTransaction.add(R.id.fragment, mFragment).commit()
        }
    }
}