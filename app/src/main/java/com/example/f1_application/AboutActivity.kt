package com.example.f1_application

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnSignIn: Button = findViewById(R.id.btn_signIn)
        btnSignIn.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
        val aboutInfo = """
            Formula 1, often referred to as F1, is a premier international auto racing series that showcases the pinnacle of motorsports. With a rich history dating back to the inaugural season in 1950, Formula 1 has evolved into a global phenomenon, captivating millions of fans worldwide.
           
            F1 events take place on diverse racing circuits around the world, each known for its unique challenges and characteristics.
            The championship features a grid of teams, each fielding two drivers. Iconic teams like Ferrari, Mercedes, and Red Bull, along with talented drivers, compete for supremacy.
            Formula 1 is renowned for its cutting-edge technology and continuous pursuit of innovation. Teams invest heavily in aerodynamics, engine development, and advanced materials to gain a competitive edge.
            The F1 season consists of a series of races known as Grands Prix. Points are awarded based on finishing positions, and the driver and team with the most points at the end of the season are crowned world champions.
            F1 enjoys a massive global following, with fans drawn to the excitement of high-speed racing, strategic team decisions, and the glamour associated with the sport.
            
            Famous Moments:
            - Ayrton Senna's masterful drives.
            - Michael Schumacher's dominance in the early 2000s.
            - Lewis Hamilton's record-breaking achievements in recent years.
            
            Whether you're a seasoned fan or a newcomer, Formula 1 offers an unparalleled spectacle of speed, skill, and passion.
        """.trimIndent()

    }
}