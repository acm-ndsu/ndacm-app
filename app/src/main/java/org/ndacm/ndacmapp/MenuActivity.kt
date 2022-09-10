package org.ndacm.ndacmapp

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.WindowCompat

class MenuActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        WindowCompat.setDecorFitsSystemWindows(window,false) //for edge-to-edge display


        val menuButtonPreferences = findViewById<View>(R.id.menu_textview_preferences) as TextView
        menuButtonPreferences.setOnClickListener {
            Toast.makeText(
                this@MenuActivity,
                "Preferences :)",
                Toast.LENGTH_SHORT
            ).show()
        }
        val menuButtonRoster = findViewById<View>(R.id.menu_textview_roster) as TextView
        menuButtonRoster.setOnClickListener {
            Toast.makeText(
                this@MenuActivity,
                "Roster :)",
                Toast.LENGTH_SHORT
            ).show()
        }
        val menuButtonEvents = findViewById<View>(R.id.menu_textview_events) as TextView
        menuButtonEvents.setOnClickListener {
            Toast.makeText(
                this@MenuActivity,
                "Events :)",
                Toast.LENGTH_SHORT
            ).show()
        }
        val menuButtonAbout = findViewById<View>(R.id.menu_textview_about) as TextView
        menuButtonAbout.setOnClickListener {
            Toast.makeText(
                this@MenuActivity,
                "About Us :)",
                Toast.LENGTH_SHORT
            ).show()
        }
        val menuButtonCredit = findViewById<View>(R.id.menu_textview_credit) as TextView
        menuButtonCredit.setOnClickListener {
            Toast.makeText(
                this@MenuActivity,
                "Credit System :)",
                Toast.LENGTH_SHORT
            ).show()
        }
        val menuButtonCamera = findViewById<View>(R.id.menu_textview_camera) as TextView
        menuButtonCamera.setOnClickListener {
            Toast.makeText(
                this@MenuActivity,
                "ACM Camera:)",
                Toast.LENGTH_SHORT
            ).show()
        }
        val menuButtonExtra = findViewById<View>(R.id.menu_textview_extra) as TextView
        menuButtonExtra.setOnClickListener {
            Toast.makeText(
                this@MenuActivity,
                "Extra button :o",
                Toast.LENGTH_SHORT
            ).show()
        }
    }


}