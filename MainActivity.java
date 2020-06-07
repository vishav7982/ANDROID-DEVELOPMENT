package com.example.imageswitcher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int value=0;
    public void switchImage(View view)
    {
        Log.i( "Info",  "Button Pressed" );
        ImageView imageView = (ImageView) findViewById(R.id.imageView3);
        if(value==0)
        {
            imageView.setImageResource(R.drawable.cat2);
            value=1;
        }
        else
        {
            imageView.setImageResource(R.drawable.anime_cat);
            value=0;
        }

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}