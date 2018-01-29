package com.gmail.farasabiyyu12.intentlearning;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityImplicitIntent extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    String noTelp = "082391077526";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intent);

        btn1 = (Button)findViewById(R.id.btnPhoneCell);
        btn2 = (Button)findViewById(R.id.btnSendEmail);
        btn3 = (Button)findViewById(R.id.btnSendSMS);
        btn4 = (Button)findViewById(R.id.btnViewURL);

        btn1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("MissingPermission")
            @Override
            public void onClick(View view) {
                //action when btnPhoneCell Clicked
                //Intent Implicit To Phone Number
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + noTelp));
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
    }
}
