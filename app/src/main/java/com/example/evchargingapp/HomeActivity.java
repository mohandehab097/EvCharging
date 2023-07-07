package com.example.evchargingapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.util.Locale;

public class HomeActivity extends AppCompatActivity {
    TextView chargeStatusBtn,StartChargeBtn,location;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        chargeStatusBtn=findViewById(R.id.chargeStatus);
        StartChargeBtn=findViewById(R.id.startCharge);
        location =findViewById(R.id.tv_location);

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

        location.setOnClickListener(view -> {
            openGoogleMaps(31.309183998122347, 30.06399541349165);
        });

    }


    private void openGoogleMaps(double latitude, double longitude) {
        String uri = String.format(Locale.ENGLISH, "geo:%f,%f?q=%f,%f(%s)", latitude, longitude, latitude, longitude, "Destination");
        Uri gmmIntentUri = Uri.parse(uri);
        Intent intent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }
}