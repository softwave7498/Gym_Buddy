package com.example.monty.myui;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t;
    ImageButton i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t = (TextView)findViewById(R.id.textView10);
        i = (ImageButton)findViewById(R.id.imageView1);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent in = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/DSCUDR.IN/"));
                startActivity(in);
            }
        });

        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent in = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:7665738184"));
                startActivity(in);

            }
        });
    }
}
