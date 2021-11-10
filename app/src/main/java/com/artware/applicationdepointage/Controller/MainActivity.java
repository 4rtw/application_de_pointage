package com.artware.applicationdepointage.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.artware.applicationdepointage.R;

public class MainActivity extends AppCompatActivity {

    Button bouttonScanner, bouttonQuitter, bouttonHistory;
    Context context;

    // TODO historique
    // TODO icon + appel serveur + mandamina code

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bouttonScanner = findViewById(R.id.btn_scanner);
        bouttonQuitter = findViewById(R.id.btn_quit);
        bouttonHistory = findViewById(R.id.btn_history);

        context = this;

        setPermission();
        setClickListener(context);
    }

    private void setPermission(){
        int requestCode = 100;

        if (ContextCompat.checkSelfPermission(context, Manifest.permission.CAMERA)
                == PackageManager.PERMISSION_DENIED)
        {
            ActivityCompat.requestPermissions(MainActivity.this, new String[] {Manifest.permission.CAMERA}, requestCode);
        }
    }

    private void setClickListener(Context context){
        bouttonScanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Test", "Test");

                //Mideclarer intention
                // Hi-start an'ilay activity QRActivity
                Intent qrStart = new Intent(context, QRActivity.class);
                startActivity(qrStart);
            }
        });

        bouttonQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
            }
        });

        bouttonHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, HistoryActivity.class);
                startActivity(intent);
            }
        });
    }
}