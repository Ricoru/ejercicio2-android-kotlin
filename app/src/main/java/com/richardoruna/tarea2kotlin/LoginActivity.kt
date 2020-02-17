package com.richardoruna.tarea2kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        username_edittext.setText("ricoru21@gmail.com")
        password_edittext.setText("123456")

        sigin_button.setOnClickListener {
            if (username_edittext.text.isNullOrEmpty() || password_edittext.text.isNullOrEmpty()) {
                Toast.makeText(this, "Usuario/Password son requeridos", Toast.LENGTH_SHORT).show()
            }
            startActivity(Intent(this, MenuPrincipalActivity::class.java))
        }

    }

}
