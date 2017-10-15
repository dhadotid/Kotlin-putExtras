package com.sipeg.kotlin1

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_output.*

/**
 * Created by dhadotid on 15/10/2017.
 */

class OutputActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output)

        supportActionBar?.title = ("Output Data")
        supportActionBar?.subtitle = ("Belajar Kotlin")

        val bundle = intent.extras

        outputNama.text = ("Nama: " + bundle.getCharSequence(MainActivity.NAMA))
        outputPassword.text = ("Password: " + bundle.getCharSequence(MainActivity.PASSWORD))
        outputEmail.text = ("Email: " + bundle.getCharSequence(MainActivity.EMAIL))
        outputJenisKelamin.text = ("Jenis Kelamin: " + bundle.getCharSequence(MainActivity.JENIS_KELAMIN))
    }
}
