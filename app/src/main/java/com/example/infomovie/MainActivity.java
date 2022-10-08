package com.example.infomovie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {
    private EditText userEmail;
    private EditText userPassword;

    private final String[] listUser = {"ricardo", "maria", "jose", "antonio"};
    private final String[] listPassword = {"0404", "0000", "1234", "1122"};
    private ArrayList<String> arrayUser = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userEmail = findViewById(R.id.email_field);
        userPassword = findViewById(R.id.password_field);
    }

    private void addUser() {
        for (int i = 0; i < listUser.length; i++) {
            arrayUser.add(listUser[i]);
        }
    }

    public void ingresar(View view) {
        String email = userEmail.getText().toString();
        String password = userPassword.getText().toString();
        addUser();
        Intent intentHome = new Intent(this, HomeScreen.class);

        if (arrayUser.contains(email)) {
            int position = arrayUser.indexOf(email);
            if (password.isEmpty()) {
                Toast.makeText(this, "Ingresa contrasena", Toast.LENGTH_SHORT).show();
            } else if (listPassword[position].equals(password)) {
                if (intentHome.resolveActivity(getPackageManager()) != null) {
                    startActivity(intentHome);
                }

            } else {
                Toast.makeText(this, "Clave incorrecta", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Usuario no encontrado", Toast.LENGTH_SHORT).show();
        }
    }


}


