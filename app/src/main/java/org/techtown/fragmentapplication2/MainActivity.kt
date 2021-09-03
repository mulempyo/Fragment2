package org.techtown.fragmentapplication2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.techtown.fragmentapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{ActivityMainBinding.inflate(layoutInflater)}
    val listFragment by lazy{ListFragment()}
    val detailFragment by lazy{DetailFragment()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setFragment()
    }
    fun goDetail(){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout,detailFragment)
        transaction.addToBackStack("detail")
        transaction.commit()
    }
    fun goBack(){
        onBackPressed()
    }

    fun setFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.frameLayout,listFragment)
        transaction.commit()

    }
}