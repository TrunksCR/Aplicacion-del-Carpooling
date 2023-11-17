package com.example.appcarpooling

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


/**
 * Clase principal de la aplicación que representa la pantalla principal (MainActivity).
 */


class MainActivity : AppCompatActivity() {


    /**
     * Método llamado cuando se crea la actividad.
     *
     * @param savedInstanceState El estado de la instancia guardado.
     */

    // Obtener la referencia al TextView para ir al registro
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvGoRegister = findViewById<TextView>(R.id.tv_go_to_register)
        tvGoRegister.setOnClickListener {
            goToRegister()
        }
    }


    /**
     * Método que inicia la actividad de registro (RegisterActivity).
     */



    private fun goToRegister(){
        val i = Intent(this,RegisterActivity::class.java)
        startActivity(i)
    }
}