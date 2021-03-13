package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

//Create a Dice Roller activity
class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//Set contentView for Activity
        setContentView(R.layout.activity_main)
//save button rerferance in variable rollButton
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        //setOnclickListener And Generate a toast
        rollButton.setOnClickListener{
            //call rollDice function
            rollDice()
        }

        diceImage = findViewById(R.id.dice_imageview)
    }
//Generate random number and modify textViews
    private fun rollDice() {
    //Generate Random Number
    val randomInt = Random().nextInt(6)+1
    //we decide which image show by random number for this we use when expression and
    // we save referance of these rundom number in drawableResourace
    val drawableResource = when(randomInt){
        1->R.drawable.dice_1
        2->R.drawable.dice_2
        3->R.drawable.dice_3
        4->R.drawable.dice_4
        5->R.drawable.dice_5
        else->R.drawable.dice_6
    }
    //save textView referance in variable
    val resultText: TextView = findViewById(R.id.Dice_textview)

    //result Text assign Random Number
    resultText.text = randomInt.toString()

    //assign drawableResource  to setImageResource
    diceImage.setImageResource(drawableResource)

    }


}