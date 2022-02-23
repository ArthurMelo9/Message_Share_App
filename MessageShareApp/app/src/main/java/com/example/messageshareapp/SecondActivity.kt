package com.example.messageshareapp


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        //getting the intent from the main activity
        val getIntent : Bundle? = intent.extras
        val msg = getIntent!!.getString("user_message")

        Toast.makeText(this, msg,Toast.LENGTH_SHORT).show()
        //creating a text view to display the message typed by the user in the first activity
        val userMsg : TextView
        userMsg = findViewById(R.id.userText)
        userMsg.text = msg

        val enterYourName: EditText
        enterYourName = findViewById(R.id.enterName)

        val receiveName = enterYourName.text
        val displayGreeting : TextView
        displayGreeting = findViewById(R.id.displayGreeting)

        val displayNameBtn : Button
        displayNameBtn = findViewById(R.id.buttonClickMe)
        displayNameBtn.setOnClickListener {
            Toast.makeText(this,"This button has been clicked!", Toast.LENGTH_SHORT).show()
            //creating a text view to display the name typed by the user
            displayGreeting.text = "Hello $receiveName"
        }
    }
}