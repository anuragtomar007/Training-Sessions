package com.example.anurag.trainingsessions;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    private Button btnLogin;
    private Button btnRecycler;
    private Button btnBundle;
    private Button btnViewPager;
    private Button btnPlayer;
    private Button btnList;
    private Button btn_toSignUpPage;
    private Button btnFogotPassword;
    private EditText username;
    private EditText password;
    private String[] Sports = {"Cricket", "Football", "Basketball", "Golf", "Badminton", "Kabbadi"};
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinnerPractice);
        btnLogin = findViewById(R.id.btn_login);
        btnRecycler = findViewById(R.id.btn_Recyclerview);
        btnBundle = findViewById(R.id.btn_bundle);
        btnViewPager = findViewById(R.id.btn_viewpager);
        btnList = findViewById(R.id.btn_List);
        btnPlayer = findViewById(R.id.btn_Player);
        btnFogotPassword = findViewById(R.id.btn_forgotPassword);
        btn_toSignUpPage = findViewById(R.id.btn_tosignup);
        username = findViewById(R.id.ev_username);
        password = findViewById(R.id.ev_password);

        spinner.setOnItemSelectedListener(this);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, Sports);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(arrayAdapter);

        btnLogin.setOnClickListener(this);
        btnFogotPassword.setOnClickListener(this);
        btn_toSignUpPage.setOnClickListener(this);
        btnBundle.setOnClickListener(this);
        btnPlayer.setOnClickListener(this);
        btnList.setOnClickListener(this);
        btnRecycler.setOnClickListener(this);
        btnViewPager.setOnClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                if (username.getText().toString().trim().length() == 0 || password.getText().toString().trim().length() == 0)
                    Toast.makeText(MainActivity.this, "Please Enter the Credentials", Toast.LENGTH_SHORT).show();
                else {
                    UserDetails userDetails = new UserDetails(username.getText().toString(),
                            password.getText().toString());
                    Intent intent = new Intent(MainActivity.this, UserDetailsActivity.class);
                    intent.putExtra("UserDetails", userDetails);
                    startActivity(intent);
                }
                break;

            case R.id.btn_forgotPassword:
                Toast.makeText(MainActivity.this, "Reset Link is sent to your Registered email", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btn_tosignup:
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
                break;

            case R.id.btn_bundle:
                Intent i = new Intent(MainActivity.this, BundleActivity1.class);
                startActivity(i);
                break;

            case R.id.btn_Player:
                Intent ip = new Intent(MainActivity.this, DataTransfer.class);
                startActivity(ip);
                break;

            case R.id.btn_List:
                Intent il = new Intent(MainActivity.this, ListViewMainActivity.class);
                startActivity(il);
                break;

            case R.id.btn_viewpager:
                Intent iv = new Intent(MainActivity.this, MainActivityViewPager.class);
                startActivity(iv);
                break;

            case R.id.btn_Recyclerview:
                Intent ir = new Intent(MainActivity.this, MainActivityRecyclerView.class);
                startActivity(ir);
                break;

                default:break;
        }
    }
}
