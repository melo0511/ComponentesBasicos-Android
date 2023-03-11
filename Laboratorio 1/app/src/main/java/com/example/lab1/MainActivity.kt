package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    var radio = ""
    var check = ""
    var toogle = ""
    var switch = ""

    val inputName:EditText=findViewById(R.id.inputName)
    val inputAge:EditText=findViewById(R.id.inputAge)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalculate: Button =findViewById(R.id.btnCalculate)
        btnCalculate.setOnClickListener { Onclick() }
    }

    private fun Onclick() {

        //Capturar Nombre y edad

        var name:String=inputName.text.toString()
        var age:Double=inputAge.text.toString().toDouble()

        //RadioButton

        val btnRadio1:RadioButton=findViewById(R.id.radioButton1)
        val btnRadio2:RadioButton=findViewById(R.id.radioButton2)

        if(btnRadio1.isChecked){
            btnRadio2.isChecked=false
            radio="Radio 1 Seleccionado\n"
        }else if(btnRadio2.isChecked){
            btnRadio2.isChecked=true
            radio="Radio 2 Seleccionado\n"
        }

        //CheckBox

        val btnCheck1:CheckBox=findViewById(R.id.checkBox1)
        val btnCheck2:CheckBox=findViewById(R.id.checkBox2)

        if(btnCheck1.isChecked){
            check="Check 1 Seleccionado\n"
        }else if(btnCheck2.isChecked){
            check="Check 1 Seleccionado\n"
        }else if(btnCheck1.isChecked && btnCheck2.isChecked){
            check="Check 1 Seleccionado\nCheck 2 Seleccionado\n"
        }

        //ToogleButton

        val btnToogle: ToggleButton =findViewById(R.id.toggleButton)

        if(btnToogle.isChecked){
            toogle="ToogleButton Seleccionado\n"
        }

        //Switch

        val btnSwitch:Switch=findViewById(R.id.btnSwitch)

        if(btnSwitch.isChecked){
            switch="Switch Seleccionado\n"
        }

        //Imprimir
        Toast.makeText(this,"Nombre: $name\nEdad: $age\n$radio$check$toogle$switch",Toast.LENGTH_LONG).show()

    }
}