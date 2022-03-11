package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFHTMLvaAWP extends AppCompatActivity {

    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfhtmlva_awp);
        pdfView = findViewById(R.id.pdfView1);


        pdfView.fromAsset("WEBSERVER.pdf").load();

    }
}