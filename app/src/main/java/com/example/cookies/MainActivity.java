package com.example.cookies;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void display(String s){
        ImageView image=(ImageView)findViewById(R.id.android_cookie_image_view);
        image.setImageResource(R.drawable.after_cookie);
        TextView quantityTextView = (TextView) findViewById(R.id.status_text_view);
        quantityTextView.setText(s);
    }

    public void eatCookie(View view) {
    String s=("I'm so full");
    display(s);
    }
}