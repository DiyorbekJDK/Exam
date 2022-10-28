package com.example.taskdiyorbek

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioGroup
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
            val button: Button = myDialog.findViewById(R.id.setColor)
            val radioGroup = myDialog.findViewById<RadioGroup>(R.id.bigRadio)
            val alertDIalog = AlertDialog.Builder(this).apply {
                setView(myDialog)
                radioGroup.setOnCheckedChangeListener { _, id ->
                    when (id) {
                        R.id.redColor -> {

                                backGround.setBackgroundColor(
                                    ContextCompat.getColor(
                                        this@MainActivity,
                                        R.color.red
                                    )
                                )

                        }
                        R.id.blueColor -> {
                            button.setOnClickListener {
                                backGround.setBackgroundColor(
                                    ContextCompat.getColor(
                                        this@MainActivity,
                                        R.color.blue
                                    )
                                )
                            }
                        }
                        R.id.yellowColor -> {
                            button.setOnClickListener {
                                backGround.setBackgroundColor(
                                    ContextCompat.getColor(
                                        this@MainActivity,
                                        R.color.yellow
                                    )
                                )
                            }
                        }
                        R.id.greenColor -> {
                            button.setOnClickListener {
                                backGround.setBackgroundColor(
                                    ContextCompat.getColor(
                                        this@MainActivity,
                                        R.color.green
                                    )
                                )
                            }
                        }
                        R.id.pinkColor -> {
                            button.setOnClickListener {
                                backGround.setBackgroundColor(
                                    ContextCompat.getColor(
                                        this@MainActivity,
                                        R.color.pink
                                    )
                                )
                            }
                        }
                        R.id.brownColor -> {
                            button.setOnClickListener {
                                backGround.setBackgroundColor(
                                    ContextCompat.getColor(
                                        this@MainActivity,
                                        R.color.brown
                                    )
                                )
                            }
                        }
                        R.id.tintColor -> {
                            button.setOnClickListener {
                                backGround.setBackgroundColor(
                                    ContextCompat.getColor(
                                        this@MainActivity,
                                        R.color.teal_200
                                    )
                                )
                            }
                        }
                        R.id.grayColor -> {
                            button.setOnClickListener {
                                backGround.setBackgroundColor(
                                    ContextCompat.getColor(
                                        this@MainActivity,
                                        R.color.lime
                                    )
                                )
                            }
                        }
                        R.id.orangeColor -> {
                            button.setOnClickListener {
                                backGround.setBackgroundColor(
                                    ContextCompat.getColor(
                                        this@MainActivity,
                                        R.color.orange
                                    )
                                )
                            }
                        }

                    }
                }
            }.create().show()
        }

    }


}
