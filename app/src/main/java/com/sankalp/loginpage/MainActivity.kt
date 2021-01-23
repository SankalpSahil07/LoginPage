package com.sankalp.loginpage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    lateinit var ed_mobile_no : TextInputEditText
    lateinit var ed_password : TextInputEditText
    lateinit var btn_login : Button
    val validMobileNo = "0123456789"
    val validPassword = arrayOf("tony","steve","bruce","thanos")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed_mobile_no = findViewById(R.id.ed_mobile_No)
        ed_password = findViewById(R.id.ed_password)
        btn_login = findViewById(R.id.btn_logIn)

        btn_login.setOnClickListener{
            val mobileNumber = ed_mobile_no.text.toString()
            val loginPassword = ed_password.text.toString()

            if ((mobileNumber == validMobileNo) && (validPassword.contains(loginPassword))){
                val intent = Intent(this@MainActivity, CardViewActivity::class.java)
                startActivity(intent)
                Toast.makeText(this@MainActivity,"Login Successful",Toast.LENGTH_SHORT).show()
            } else{
                Toast.makeText(this@MainActivity,"Incorrect Credential", Toast.LENGTH_SHORT).show()
            }
        }
    }
}