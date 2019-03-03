package com.example.ece387_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String dot = "cool";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        dot = dot + ". ";
        TextView tv = (TextView) findViewById(R.id.textView4);
        tv.setText(dot);

    }

    public void Clear(View view) {
        dot = "cool";
        TextView tv = (TextView) findViewById(R.id.textView4);
        tv.setText(dot);
    }
}
