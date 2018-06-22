package com.example.oalam.challenge21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PassageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passage);

        TextView textView=(TextView)findViewById(R.id.text_view);
        Intent intent=getIntent();
        String para =intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        textView.setText(para);
        Log.d("Passage",""+para);
    }
}
