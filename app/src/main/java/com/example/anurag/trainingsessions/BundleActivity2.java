package com.example.anurag.trainingsessions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class BundleActivity2 extends AppCompatActivity {
    private TextView name;
    private TextView lastname;
    private String Sname;
    private String Slastname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bundle2);

        name=findViewById(R.id.tv_name);
        lastname=findViewById(R.id.tv_lname);

        Intent i = getIntent();
        Bundle b=i.getExtras();
        Sname = b.getString("Name");
        Slastname = b.getString("LastName");

        name.setText(Sname);
        lastname.setText(Slastname);
    }
}
