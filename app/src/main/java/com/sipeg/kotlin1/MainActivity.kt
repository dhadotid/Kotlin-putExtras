package com.sipeg.kotlin1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        //static class kotlin
        val NAMA: String? = "nama"
        val PASSWORD: String? = "password"
        val EMAIL: String? = "email"
        val JENIS_KELAMIN: String? = "jenis kelamin"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = ("Halaman Register")
        supportActionBar?.subtitle = ("Belajar kotlin")

        tombolRegistrasi.setOnClickListener{
            if(inputNama.text.isEmpty() || inputPassword.text.isEmpty() || inputEmail.text.isEmpty() || jenisKelaminGroup.checkedRadioButtonId == -1){
                toast("Harap isi data", Toast.LENGTH_LONG)
            }else if(inputNama.text.isNotEmpty() || inputPassword.text.isNotEmpty() || inputEmail.text.isNotEmpty()){
                toast("Regis berhasil", Toast.LENGTH_SHORT)

                val intent = Intent(this, OutputActivity::class.java)
                val bundle = Bundle()
                bundle.putString(NAMA, inputNama.text.toString())
                bundle.putString(PASSWORD, inputPassword.text.toString())
                bundle.putString(EMAIL, inputEmail.text.toString())

                val id = jenisKelaminGroup.checkedRadioButtonId
                val radioButton = findViewById(id) as RadioButton
                bundle.putString(JENIS_KELAMIN, radioButton.text.toString())

                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }

    fun toast(message: String, length: Int = Toast.LENGTH_LONG){
        Toast.makeText(this, message, length).show()
    }
}
