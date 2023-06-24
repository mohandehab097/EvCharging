package com.example.evchargingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView chargeStatusBtn,StartChargeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        chargeStatusBtn=findViewById(R.id.chargeStatus);
        StartChargeBtn=findViewById(R.id.startCharge);

        chargeStatusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, ChargeStatusActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_down_in, R.anim.push_up_out);
            }
        });

        StartChargeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, StartChargeActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_down_in, R.anim.push_up_out);
            }
        });

    }


}