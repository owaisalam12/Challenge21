package com.example.oalam.challenge21;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE ="owais";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void secondActivity(View view) {
        Intent intent=new Intent(this,PassageActivity.class);
        switch (view.getId()){
            case R.id.button_one:
                intent.putExtra(EXTRA_MESSAGE,getString(R.string.para1));
//                Toast.makeText(this, "button one", Toast.LENGTH_SHORT).show();
//                startActivity(intent);

                break;
            case R.id.button_two:
                intent.putExtra(EXTRA_MESSAGE,getString(R.string.para2));
//                Toast.makeText(this, "button two", Toast.LENGTH_SHORT).show();
                //startActivity(intent);

                break;
            case R.id.button_three:
                intent.putExtra(EXTRA_MESSAGE,getString(R.string.para3));
//                Toast.makeText(this, "button three", Toast.LENGTH_SHORT).show();
//                startActivity(intent);

                break;
        }

        startActivity(intent);
    }
}
