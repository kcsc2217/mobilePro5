package com.example.example;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {
    Button nate;
    Button emergency;
    Button gallery;
    Button exit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nate = (Button) findViewById(R.id.nate);
        Button emergency = (Button) findViewById(R.id.emergency);
        Button gallery = (Button) findViewById(R.id.gallery);
        Button exit = (Button) findViewById(R.id.exit);



        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.nate.com"));
                Intent mIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:/119"));
                Intent mIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("content://media/internal/images/media"));

                switch (v.getId())
                {
                    case R.id.nate:
                        startActivity(mIntent1);
                        break;

                    case R.id.emergency:
                        startActivity(mIntent2);
                        break;

                    case R.id.gallery:
                        startActivity(mIntent3);

                    case R.id.exit:
                        finish();
                }

            }
        };

        nate.setOnClickListener(listener);
        emergency.setOnClickListener(listener);
        gallery.setOnClickListener(listener);
        exit.setOnClickListener(listener);

    }
}