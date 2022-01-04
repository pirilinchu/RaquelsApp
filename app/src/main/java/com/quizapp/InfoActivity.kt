package com.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.github.barteksc.pdfviewer.PDFView
import kotlinx.android.synthetic.main.activity_info.*

class InfoActivity : AppCompatActivity() {

    private var pdfFileName: String = "sample3.pdf"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val pdfFileName2 = intent.getStringExtra("PDF")
        if ( !pdfFileName2.isNullOrEmpty() ) {
            pdfFileName = pdfFileName2
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        pdf_view.fromAsset(pdfFileName).load()
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return if (item.itemId == android.R.id.home) {
            finish()
            true
        } else {
            super.onOptionsItemSelected(item)
        }
    }
}