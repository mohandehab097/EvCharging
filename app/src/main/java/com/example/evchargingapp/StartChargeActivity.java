package com.example.evchargingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class StartChargeActivity extends AppCompatActivity {

    Spinner dropdown;
    TextView start,stop,back;
    FirebaseDatabase firebase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_charge);
//         dropdown = findViewById(R.id.spinner1);
         start = findViewById(R.id.start);
         stop = findViewById(R.id.stop);
        back = findViewById(R.id.back);

        firebase = FirebaseDatabase.getInstance();
        DatabaseReference ref = firebase.getReference("checkRelay");
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref.setValue("on");
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ref.setValue("off");

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartChargeActivity.this, HomeActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.push_down_in, R.anim.push_up_out);
            }
        });



//        String[] items = new String[]{"1", "2", "three"};
//        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,R.layout.complaint_dialog, items);
//        dropdown.setAdapter(adapter);






    }



}