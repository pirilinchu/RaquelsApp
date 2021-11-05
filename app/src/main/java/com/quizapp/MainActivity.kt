package com.quizapp

import android.content.Intent
import android.icu.text.IDNA
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    /**
     * This function is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_main)

        // To hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
            .getBoolean("isFirstRun", true)

        if (true) {
            //show start activity
            startActivity(Intent(this@MainActivity, AboutActivity::class.java))
        }


        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
            .putBoolean("isFirstRun", false).commit()

        btn_start.setOnClickListener {

            if (et_name.text.toString().isEmpty()) {

                Toast.makeText(this@MainActivity, "Por favor ingresa tu nombre.", Toast.LENGTH_SHORT)
                        .show()
            } else {

                val intent = Intent(this@MainActivity, QuizQuestionsActivity::class.java)
                // TODO (STEP 2: Pass the name through intent using the constant variable which we have created.)
                // START
                intent.putExtra(Constants.USER_NAME, et_name.text.toString())
                // END
                startActivity(intent)
                finish()
            }
        }

        btn_info_2.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)
            startActivity(intent)

        }
    }
}