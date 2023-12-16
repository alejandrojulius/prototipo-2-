package com.example.appcl1_alejandro_fernandez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResumenVentaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen_venta)

        val  entradasActivity = intent.getStringExtra("Entrada")
        val ventadeEntradasActivity = intent.getStringExtra("producto")

        val textViewResumenVentaActivity = findViewById<TextView>(R.id.textViewR)
        textViewResumenVentaActivity = "Tipo de entrada:$entryType\nVentaActivity : $ventadeEntradasActivity"

    }
}