package com.artware.applicationdepointage.Controller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.artware.applicationdepointage.ListAdapters.HistoryAdapter;
import com.artware.applicationdepointage.Model.Personne;
import com.artware.applicationdepointage.R;

import java.util.ArrayList;
import java.util.List;

public class HistoryActivity extends AppCompatActivity {

    RecyclerView historyList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        // 1 - List (ok)
        // 2 - Pozin'ny element anak'iray (ok)
        // 3 - Adapter

        //TODO esorina rehefa vita ny base de données
        Personne personne1 = new Personne(12345, "Aina1","Randria7", false);
        Personne personne2 = new Personne(12346, "Aina2","Randria8", false);
        Personne personne3 = new Personne(12347, "Aina3","Randria9", false);
        Personne personne4 = new Personne(12348, "Aina4","Randria10",false);
        Personne personne5 = new Personne(12349, "Aina5","Randria11",false);
        Personne personne6 = new Personne(12350, "Aina6","Randria12",false);

        List<Personne> personneList = new ArrayList<>();
        personneList.add(personne1);
        personneList.add(personne2);
        personneList.add(personne3);
        personneList.add(personne4);
        personneList.add(personne5);
        personneList.add(personne6);
        //TODO fin todo

        historyList = findViewById(R.id.historyList);
        historyList.setAdapter(new HistoryAdapter(personneList, this));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        historyList.setLayoutManager(layoutManager);


    }
}