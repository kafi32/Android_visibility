package com.kafi.androidvisibility;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView image;
    Button bshow, bHide, bToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        image = findViewById(R.id.image);
        bshow = findViewById(R.id.bshow);
        bHide = findViewById(R.id.bHide);
        bToast = findViewById(R.id.bToast);

        bshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                image.setVisibility(View.VISIBLE);
            }
        });

        bHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                image.setVisibility(View.GONE);
            }
        });

        bToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Toast is showind", Toast.LENGTH_SHORT).show();
            }
        });



    }
}