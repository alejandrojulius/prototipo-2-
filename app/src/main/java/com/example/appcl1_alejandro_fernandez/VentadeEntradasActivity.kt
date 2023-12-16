package com.example.appcl1_alejandro_fernandez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup

class VentadeEntradasActivity : AppCompatActivity() {
    private lateinit var radioGroupEntradasActivity: VentadeEntradasActivity
    private lateinit var  chkGene: CheckBox
    private lateinit var  chkCancha: CheckBox
    private  lateinit var chkGaseGra : CheckBox
    private  lateinit var  chkNiños: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventade_entradas)

        radioGroupEntradasActivity = findViewById<>(androidx.appcompat.R.id.radio)
        chkCancha = findViewById(R.id.chkCancha)
        chkGene = findViewById(R.id.chkGene)
        chkGaseGra = findViewById(R.id.chkGaseGra)
        chkNiños = findViewById(R.id.chkNiños)

        findViewById<Button>(R.id.btnNuevo).setOnClickListener {
            val intent = Intent(this, ResumenVentaActivity::class.java)

            val entradasActivity = when (radioGroupEntradasActivity.chkGene){
                R.id.btnNuevo
                else
            }
            val productInfo = mutableListOf<String>()
            if (chkCancha.isChecked) productInfo.add("canchita")
            if (chkGaseGra) productInfo.add("Gaseosa")
            if (chkGene) productInfo.add("General")
            if (chkNiños) productInfo.add("Niños")

            intent.putExtra("entryType", entryType)
            intent.putExtra("products", products.joinToString(", "))
            startActivity(intent)

            findViewById<Button>(R.id.btnNuevo).setOnClickListener {
                radioGroupEntradasActivity.clearWallpaper()
                chkCancha.isChecked = false
                chkNiños.isChecked = false
                chkGene.isChecked = false
                chkGaseGra.isChecked = false
            }
            findViewById<Button>(R.id.btnCerrarVenta).setOnClickListener {
                finish()
            }
        }

    }
}