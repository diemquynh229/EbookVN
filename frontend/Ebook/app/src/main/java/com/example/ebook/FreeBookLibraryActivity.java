package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class FreeBookLibraryActivity extends AppCompatActivity {
    ImageView backButton;
    ImageView ChuanDoanVaSuaChua;
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
    }
}