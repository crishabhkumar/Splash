package com.rishabhkumar.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {


    lateinit var etMobileNumber : EditText
    lateinit var etPassword : EditText
    lateinit var btnLogin : Button
    lateinit var txtForgotPassword : TextView
    lateinit var txtRegister : TextView


    val validMobileNumber = "9650085383"
    val validPassword = "rishabhkumar"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)


        etMobileNumber = findViewById(R.id.edtMobileNumber)
        etPassword = findViewById(R.id.edtPassword)
        btnLogin = findViewById(R.id.btnLogin)
        txtForgotPassword = findViewById(R.id.txtForgotPassword)
        txtRegister = findViewById(R.id.txtRegisterHere)

        txtForgotPassword.setOnClickListener {
            val Intent = Intent(this@LoginActivity,ForgotPasswordActivity::class.java)
            startActivity(Intent)
        }


        txtRegister.setOnClickListener {
            val Intent = Intent(this@LoginActivity,RegistrationActivity::class.java)
            startActivity(Intent)
        }


        btnLogin.setOnClickListener{
            val mobilnumber = etMobileNumber.text.toString()
            val password = etPassword.text.toString()

            if(mobilnumber == validMobileNumber && password == validPassword){
                val Intent = Intent(this@LoginActivity,FoodActivity::class.java)
                startActivity(Intent)
            }else{
                Toast.makeText(this@LoginActivity, "Incorrect Credentials",Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onPause() {
        super.onPause()
        finish()
    }

}