package com.example.evchargingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ChargerTypesActivity extends AppCompatActivity {
    ChargerAdapter adapter = new ChargerAdapter();
    RecyclerView recyclerView;

    TextView dc, ac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charger_types);
        dc = findViewById(R.id.tv_dc);
        ac = findViewById(R.id.tv_ac);
        recyclerView = findViewById(R.id.rv_types);
        recyclerView.setAdapter(adapter);

        List<Charger> chargers = new ArrayList();

        chargers.add(new Charger(0, "J1772", "AC", "North America", R.drawable.j1772));
        chargers.add(new Charger(1, "Mennekes", "AC", "EU", R.drawable.mennekes_type_2));
        chargers.add(new Charger(2, "CCS1", "DC", "North America", R.drawable.ccs));
        chargers.add(new Charger(3, "CCS2", "DC", "EU", R.drawable.ccs2));
        chargers.add(new Charger(4, "Chademo", "DC", "Japan", R.drawable.chademo));

        adapter.submitList(chargers);

        ac.setOnClickListener(view -> {
            Intent intent = new Intent(ChargerTypesActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        dc.setOnClickListener(view -> {
            Intent intent = new Intent(ChargerTypesActivity.this, HomeActivity.class);
            startActivity(intent);
        });
    }
}