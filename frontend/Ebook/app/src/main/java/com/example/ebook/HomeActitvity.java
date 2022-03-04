package com.example.ebook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HomeActitvity extends AppCompatActivity {
    ImageView bookIcon, lectureIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_actitvity);
        bookIcon = findViewById(R.id.BookIcon);
        lectureIcon = findViewById(R.id.LectureIcon);
        bookIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActitvity.this, BookLibraryActivity.class);
                startActivity(intent);
            }
        });

        lectureIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActitvity.this, LectureLibraryActivity.class);
                startActivity(intent);
            }
        });
    }
}