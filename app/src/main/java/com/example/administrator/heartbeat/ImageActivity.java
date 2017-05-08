package com.example.administrator.heartbeat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        Intent intent = getIntent();
        int heartViewId=intent.getIntExtra("heartViewId",1);
        ImageView heartImage = (ImageView) findViewById(R.id.image_view);
        heartImage.setImageResource(heartViewId);

    }
}
