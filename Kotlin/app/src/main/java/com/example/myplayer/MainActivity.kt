package com.example.myplayer

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val prueba = 3
        var texto : String = "Hola mundo cruel kotlin"
        this.findViewById<TextView>(R.id.message).text = texto

        val message : TextView = findViewById(R.id.message)
        message.text=texto
        val edtmessage : EditText = findViewById(R.id.edtmessage)

        val button : Button = findViewById(R.id.button)
        button.setOnClickListener() {
            //Ejemplo de string templates
            toast("Hello ${edtmessage.text}")
        }
    }

    private fun toast(message : String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}