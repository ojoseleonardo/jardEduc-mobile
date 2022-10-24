package com.example.jareduc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_form_login);


        TextView forgotPassword = (TextView) findViewById(R.id.text_esqueceu_a_senha);
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(LoginForm.this, ForgotPasswordForm.class);
                startActivity(it);
            }
        });

        TextView text_cadastro = (TextView) findViewById(R.id.text_cadastro);
        text_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(LoginForm.this, CadastroForm.class);
                startActivity(it);
                finish();
            }
        });

        androidx.appcompat.widget.AppCompatButton btn_login = (AppCompatButton) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(LoginForm.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });
    }
}