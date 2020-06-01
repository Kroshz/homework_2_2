package com.kroshz.homework_2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button b_next;
    private Button b_previous;
    private TextView tw_link;
    private ImageView iw_picture;

    Random rnd = new Random();
    int min = 0;
    int max = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        Random random = new Random ();
        tw_link.setText("http://myfile.org/"+random.nextInt(100));

    }
    private void init() {
        b_next =findViewById(R.id.b_next);
        b_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //tw_link.setText("2");
                startActivity(intent);

            }
        });

        b_previous = findViewById(R.id.b_previous);
        b_previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tw_link = findViewById(R.id.tw_link);
        iw_picture = findViewById(R.id.iw_picture);
    }
}
