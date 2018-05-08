package com.example.anurag.trainingsessions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    private Button btnToLogin;
    private Button btnSignUp;
    private EditText name;
    private EditText lastname;
    private EditText username;
    private EditText password;
    private EditText cpassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        btnSignUp=findViewById(R.id.btn_signUp);
        btnToLogin = findViewById(R.id.btn_toLogin);
        name = findViewById(R.id.ev_name);
        lastname = findViewById(R.id.ev_lastname);
        username = findViewById(R.id.ev_username);
        password = findViewById(R.id.ev_password);
        cpassword = findViewById(R.id.ev_cpassword);


        btnToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.getText().toString().trim().length() == 0 ||lastname.getText().toString().trim().length() == 0
                        ||username.getText().toString().trim().length() == 0 ||
                        password.getText().toString().trim().length() == 0 ||
                        cpassword.getText().toString().trim().length() == 0 )
                    Toast.makeText(SignUpActivity.this, "Please Enter the Credentials", Toast.LENGTH_SHORT).show();

                else {
                    Intent intent = new Intent(SignUpActivity.this, BlankActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
