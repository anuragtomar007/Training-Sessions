package com.example.anurag.trainingsessions;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by anurag on 23/2/18.
 */

public class UserDetailsActivity extends AppCompatActivity {
    private TextView usrname;
    private TextView password;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        usrname = findViewById(R.id.details_username);
        password = findViewById(R.id.details_password);

        Intent intent = getIntent();
        UserDetails userDetails = intent.getParcelableExtra("UserDetails");
        usrname.setText("Username :"+userDetails.getUsername());
        password.setText("Password :"+userDetails.getPassword());

    }
}
