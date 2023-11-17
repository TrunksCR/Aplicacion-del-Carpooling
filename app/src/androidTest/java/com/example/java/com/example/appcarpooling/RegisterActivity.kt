package com.example.appcarpooling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Clase que representa la actividad de registro (RegisterActivity) en la aplicación.
 */




class RegisterActivity : AppCompatActivity() {

    private val retrofit = Retrofit.Builder()
        .baseUrl("http://localhost:8080")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiService: ApiService = retrofit.create(ApiService::class.java)

    /**
     * Método llamado cuando se crea la actividad de registro.
     *
     * @param savedInstanceState El estado de la instancia guardado.
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val tvGoLogin = findViewById<TextView>(R.id.tv_go_to_login)
        tvGoLogin.setOnClickListener {
            goToLogin()
        }
    }

    /**
     * Método que inicia la actividad principal (inicio de sesión).
     */

    private fun goToLogin(){
        val i= Intent(this, MainActivity::class.java)
        startActivity(i)
    }
    
    
}