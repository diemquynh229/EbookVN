package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FreeBookLibraryActivity extends AppCompatActivity {
    ImageView backButton;
    ImageView ChuanDoanVaSuaChua;
    ImageView HTMLBook;
    ImageView TiaPortal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_book_library);
        backButton = findViewById(R.id.backButtonFreeBook);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FreeBookLibraryActivity.this, BookLibraryActivity.class);
                startActivity(intent);
            }
        });
        ChuanDoanVaSuaChua = findViewById(R.id.ChuanDoanVaSuaChua);
        ChuanDoanVaSuaChua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FreeBookLibraryActivity.this, ChuanDoanVaSuaChuaBook.class);
                startActivity(intent);
            }
        });

        HTMLBook = findViewById(R.id.HTMLBook);
        HTMLBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FreeBookLibraryActivity.this, PDFHTMLvaAWP.class);
                startActivity(intent);
            }
        });

        TiaPortal = findViewById(R.id.TrainBook);
        TiaPortal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FreeBookLibraryActivity.this, TiaPortalBook.class);
                startActivity(intent);
            }
        });
    }
}