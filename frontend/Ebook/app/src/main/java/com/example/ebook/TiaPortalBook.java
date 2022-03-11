package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class TiaPortalBook extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tia_portal_book);

        pdfView = findViewById(R.id.pdfView2);


        pdfView.fromAsset("trainbooking.pdf").load();
    }
}