package com.example.taskdiyorbek

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn: MaterialButton = findViewById(R.id.button)
        val backGround: ConstraintLayout = findViewById(R.id.backGround)
        btn.setOnClickListener {
            val myDialog = layoutInflater.inflate(R.layout.menu, null)
            val newBtn: Button = myDialog.findViewById(R.id.setColor)
            val red = myDialog.findViewById<CheckBox>(R.id.redColor)
            val blue = myDialog.findViewById<CheckBox>(R.id.blueColor)
            val green = myDialog.findViewById<CheckBox>(R.id.greenColor)
            val yellow = myDialog.findViewById<CheckBox>(R.id.yellowColor)
            val pink = myDialog.findViewById<CheckBox>(R.id.pinkColor)
            val brown = myDialog.findViewById<CheckBox>(R.id.brownColor)
            val tint = myDialog.findViewById<CheckBox>(R.id.tintColor)
            val gray = myDialog.findViewById<CheckBox>(R.id.grayColor)
            val orange = myDialog.findViewById<CheckBox>(R.id.orangeColor)
            var choosedColor: String = ""
            val redColor = R.color.red
            red.setOnCheckedChangeListener { buttonView, isChecked ->
                if (isChecked == true){

                }
            }
            blue.setOnCheckedChangeListener { buttonView, isChecked ->
                choosedColor = "blue2"
            }
            green.setOnCheckedChangeListener { buttonView, isChecked ->
                choosedColor = "green3"
            }
            yellow.setOnCheckedChangeListener { buttonView, isChecked ->
                choosedColor = "yellow4"
            }
            pink.setOnCheckedChangeListener { buttonView, isChecked ->
                choosedColor = "pink5"
            }
            brown.setOnCheckedChangeListener { buttonView, isChecked ->
                choosedColor = "brown6"
            }
            tint.setOnCheckedChangeListener { buttonView, isChecked ->
                choosedColor = "tint7"
            }
            gray.setOnCheckedChangeListener { buttonView, isChecked ->
                choosedColor = "gray8"
            }
            orange.setOnCheckedChangeListener { buttonView, isChecked ->
                choosedColor = "orange9"
            }
            newBtn.setOnClickListener {
                if (choosedColor == "red"){
                    backGround.setBackgroundColor(getColor(redColor))
                }
            }

            AlertDialog.Builder(this).apply {
                setView(myDialog)
            }.create().show()
        }


    }
}