package com.example.paleteriadjn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main_prov.*

class MainActivityProv : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main_prov)

        val proveedores = findViewById<Button>(R.id.btn_proveedores)

        proveedores.setOnClickListener{
            val lista = Intent(this, ListaProveedoresActivity::class.java)
            startActivity(lista)
        }

    }
}