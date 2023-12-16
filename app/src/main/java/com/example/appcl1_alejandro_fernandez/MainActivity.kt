package com.example.appcl1_alejandro_fernandez

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val txtPeso = findViewById<EditText>(R.id.txtPeso)
        val txtAltura = findViewById<EditText>(R.id.txtAltura)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val  btnNuevoR = findViewById<Button>(R.id.btnNuevoR)
        val btnVenta = findViewById<Button>(R.id.btnVenta)

        btnCalcular.setOnClickListener {
            val nombre = txtNombre.text.toString()
            val altura = txtAltura.text.toString().toFloat()
            val peso = txtPeso.text.toString().toFloat()

            val imc = peso / (peso * altura)
            var result =""

            if (imc < 18.5){
                result = "peso bajo "
            }else if (imc <25){
                result = "peso adecuado"
            }else if (imc < 30){
                result = "sobrepeso :C"
            }else if (imc < 40){
                result = "obeso :0"
            }else{
                result = "extremadamente obeso :("
            }

            Toast.makeText(this, "Hola $name, tu IMC es $imc ($result)", Toast.LENGTH_SHORT).show()
        }
         btnNuevoR.setOnClickListener {
             txtNombre.setText("")
             txtAltura.setText("")
             txtPeso.setText("")
             txtNombre.requestFocus()
         }

        btnVenta.setOnClickListener {
            val intent = Intent(this, VentadeEntradasActivity::class.java)
            startActivity(intent)
        }
    }
}