package com.example.authentication_google;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileAcitivity extends AppCompatActivity {

    private TextView textId;
    private TextView textName;
    private TextView textEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_acitivity);

        initUI();

        Intent intent = getIntent();
        String id = intent.getStringExtra("Id");
        String name = intent.getStringExtra("Name");
        String email = intent.getStringExtra("Email");

        textName.setText("¡Bienvenido " + name + "!");
        textId.setText("ID: " + id);
        textEmail.setText("Email: " + email);
    }

    private void initUI(){
        textId = findViewById(R.id.text_id);
        textName = findViewById(R.id.text_name);
        textEmail = findViewById(R.id.text_email);
    }
}
