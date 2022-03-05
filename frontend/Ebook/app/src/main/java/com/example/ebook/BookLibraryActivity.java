package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BookLibraryActivity extends AppCompatActivity {
    ImageView backButton;
    ImageView freeBook;
    ImageView paidBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_library);
        backButton = findViewById(R.id.backButtonBook);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookLibraryActivity.this, HomeActitvity.class);
                startActivity(i);
            }
        });
        freeBook = findViewById(R.id.freeBook);
        paidBook = findViewById(R.id.paidBook);

        freeBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookLibraryActivity.this, FreeBookLibraryActivity.class);
                startActivity(i);
            }
        });

        paidBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(BookLibraryActivity.this, PaidBookLibraryActivity.class);
                startActivity(i);
            }
        });
    }
}