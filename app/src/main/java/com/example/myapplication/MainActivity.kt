package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.IdRes
import androidx.fragment.app.FragmentActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

fun FragmentActivity.findNavControllerCompat(@IdRes id: Int): NavController? {
    /*
    * fix of issue https://stackoverflow.com/a/58859118/2425851
    * don't use return findNavController(id)
    * */
    return (supportFragmentManager.findFragmentById(id) as NavHostFragment?)
        ?.navController
}