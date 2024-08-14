package com.example.unisurvey

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameEditText = findViewById<EditText>(R.id.nameEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val studentIdEditText = findViewById<EditText>(R.id.studentIdEditText)
        val revirewIdEditText = findViewById<EditText>(R.id.reviewText)
        val submitButton = findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val name = nameEditText.text.toString()
            val email = emailEditText.text.toString()
            val studentId = studentIdEditText.text.toString()
            val review = revirewIdEditText.text.toString()

            val intent = Intent(this, SurveyResultActivity::class.java)
            intent.putExtra("NAME", name)
            intent.putExtra("EMAIL", email)
            intent.putExtra("STUDENT_ID", studentId)
            intent.putExtra("REVIEW", review)
            startActivity(intent)
        }
    }
}
