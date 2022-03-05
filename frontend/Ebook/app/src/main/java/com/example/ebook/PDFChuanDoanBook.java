package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PDFChuanDoanBook extends AppCompatActivity {
    PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfchuan_doan_book);

        pdfView = findViewById(R.id.pdfView);

        int chapterPosition = getIntent().getIntExtra("key", 0);
        if(chapterPosition == 0) {
            pdfView.fromAsset("Chuong1.pdf").load();
        }else if(chapterPosition == 1) {
            pdfView.fromAsset("Chuong2.pdf").load();
        }else if(chapterPosition == 2) {
            pdfView.fromAsset("Chuong3.pdf").load();
        }else if(chapterPosition == 3) {
            pdfView.fromAsset("Chuong4.pdf").load();
        }else if(chapterPosition == 4) {
            pdfView.fromAsset("Chuong5.pdf").load();
        }else if(chapterPosition == 5) {
            pdfView.fromAsset("Chuong6.pdf").load();
        }else if(chapterPosition == 6) {
            pdfView.fromAsset("PhulucA.pdf").load();
        }else if(chapterPosition == 7) {
            pdfView.fromAsset("PhulucB.pdf").load();
        }else if(chapterPosition == 8) {
            pdfView.fromAsset("MucLuc.pdf").load();
        }
    }
}