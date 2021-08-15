package com.example.vaccineapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainMenuActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<VaccineTypes> vaccineTypes;
    MainAdapter mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        recyclerView = findViewById(R.id.recycler_view);
        Integer[] vaccines = {R.drawable.covid, R.drawable.tdap, R.drawable.mmr, R.drawable.hepatitisa, R.drawable.hepatitisb};

        String[] vaccineNames = {"COVID-19", "Tdap", "MMR", "Hepatitis A", "Hepatitis B"};

        vaccineTypes = new ArrayList<>();
        for (int i=0; i<vaccines.length; i++){
            VaccineTypes type = new VaccineTypes(vaccines[i], vaccineNames[i]);
            vaccineTypes.add(type);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(MainMenuActivity.this, LinearLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mainAdapter = new MainAdapter(MainMenuActivity.this,vaccineTypes);
        recyclerView.setAdapter(mainAdapter);
    }
}