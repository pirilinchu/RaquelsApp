package com.quizapp

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        // TODO (STEP 6: Hide the status bar and get the details from intent and set it to the UI. And also add a click event to the finish button.)
        // START
        // Hide the status bar.
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val userName = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = "Gracias ${userName}"

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "Tu perfil recomendado es el ${Constants.getProfile(correctAnswers).profileName}"

        btn_finish.setOnClickListener {
            val intentRoot = Intent(this@ResultActivity, MainActivity::class.java)
            intentRoot.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            startActivity(intentRoot)
        }

        btn_send_email.setOnClickListener {

            val intent = Intent(Intent.ACTION_SEND).apply {
                val email = "raquel.ferrufino@ucb.edu.bo"
                putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
                putExtra(Intent.EXTRA_SUBJECT, "ROBOADVISOR_RESULT")
                putExtra(Intent.EXTRA_TEXT, "El perfil recomendado de $userName es el ${Constants.getProfile(correctAnswers).profileName}")
                data = Uri.parse("mailto:")
                type = "text/plain"
            }

//            val shareIntent = Intent.createChooser(intent, null)
            startActivity(intent)

            if (intent.resolveActivity(packageManager) != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "You do not have an app for sending emails, please install one", Toast.LENGTH_SHORT).show()
            }
        }

        btn_info.setOnClickListener {
            showAlertDialog(correctAnswers)
        }
    }

    private fun showAlertDialog(n: Int) {
        val alertDialog: AlertDialog.Builder = AlertDialog.Builder(this)
        alertDialog.setTitle(Constants.getProfile(n).profileName)
        alertDialog.setMessage(Constants.getProfile(n).profileDescription)
        alertDialog.setPositiveButton(
            "OK"
        ) { dialog, _ ->
            dialog.cancel()
        }
        val alert: AlertDialog = alertDialog.create()
        alert.setCanceledOnTouchOutside(false)
        alert.show()
    }

}