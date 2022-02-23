package com.example.messageshareapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toastBtn:Button
        toastBtn = findViewById(R.id.toastBtn)
        toastBtn.setOnClickListener(){
            Log.i("Main", "The toast button has been clicked")
            Toast.makeText(this, "Toast clicked", Toast.LENGTH_SHORT).show()
        }

        val receiveMsg : EditText
        receiveMsg = findViewById(R.id.enterMessage)
        val sendBtn : Button
        sendBtn = findViewById(R.id.sendMsgToNextActivity)
        sendBtn.setOnClickListener {
            val message:String = receiveMsg.text.toString()
            //Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("user_message", message)
            startActivity(intent)

        }

        val shareToOtherApps : Button
        shareToOtherApps = findViewById(R.id.shareToOtherApps)
        shareToOtherApps.setOnClickListener{
            val message:String = receiveMsg.text.toString()

            val intent = Intent()
            //getting the intent to perform an action
            intent.action = Intent.ACTION_SEND
            //EXTRA_TEXT is a predefined key
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent, "Share to: "))

        }
        val recyclerViewBtn : Button
        recyclerViewBtn = findViewById(R.id.recyclerViewDemo)
        recyclerViewBtn.setOnClickListener {
            val intent = Intent(this, RecyclerViewActivity::class.java)
            startActivity(intent)
        }
    }
}