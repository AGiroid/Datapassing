package com.example.datapassing

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentTransaction
import com.example.datapassing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),Medium{
 private val mainBinding:ActivityMainBinding by lazy {
     DataBindingUtil.setContentView(this,R.layout.activity_main)
 }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        val name=findViewById<EditText>(R.id.edName)
//        val number=findViewById<EditText>(R.id.edNumber)
//        val pass=findViewById<Button>(R.id.btnpass)

//        val mFragmentManager = supportFragmentManager
//        val mFragmentTransaction = mFragmentManager.beginTransaction()
//        val mFragment = ReceiverFragment()
//         mFragmentTransaction.add(R.id.fragment, mFragment).commit()

//        pass.setOnClickListener {
//            val bundle = Bundle()
//            bundle.putString("name", name.text.toString())
//            bundle.putString("number", number.text.toString())
//            mFragment.arguments = bundle
//            mFragmentTransaction.add(R.id.fragment, mFragment).commit()
//        }
        mainBinding.fragmentContainer
        val fragment1 = SenderFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, fragment1).commit()


    }

    override fun passdata(edname: String, edno: String) {
        val bundle = Bundle()
        bundle.putString("name", edname)
        bundle.putString("number", edno)

        val transaction = this.supportFragmentManager.beginTransaction()
        val fragment2 = ReceiverFragment()
        fragment2.arguments = bundle

        transaction.replace(R.id.fragmentContainer, fragment2)
        transaction.addToBackStack(null)
        transaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
        transaction.commit()
    }


}