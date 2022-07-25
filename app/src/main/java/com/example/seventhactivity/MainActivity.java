package com.example.seventhactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    e1 = (EditText) findViewById(R.id.editText1);
    b1 = (Button) findViewById(R.id.button1);

    b1.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
            String num = e1.getText().toString();
                    ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},1);
                  Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+num));
             startActivity(intent);               }
    });
    }
}