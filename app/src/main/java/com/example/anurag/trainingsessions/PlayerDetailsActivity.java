package com.example.anurag.trainingsessions;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class PlayerDetailsActivity extends AppCompatActivity {
    private TextView pname;
    private TextView prole;
    private TextView pcountry;
    private TextView pipl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        pname = findViewById(R.id.tv_pname);
        prole = findViewById(R.id.tv_prole);
        pcountry = findViewById(R.id.tv_pcountry);
        pipl = findViewById(R.id.tv_pipl);

        Intent intent = getIntent();
        PlayerDetails playerDetails = intent.getParcelableExtra("Player Details");

        pname.setText("Name: "+playerDetails.getPname());
        prole.setText("Role: "+playerDetails.getProle());
        pcountry.setText("Country: "+playerDetails.getPcountry());
        pipl.setText("Ipl Team: "+playerDetails.getPipl());
    }
}
