package com.example.franciscoandrade.database;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.franciscoandrade.database.database.FellowsDatabaseHelper;
import com.example.franciscoandrade.database.model.Fellow;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FellowsDatabaseHelper fellowsDatabaseHelper = new FellowsDatabaseHelper(getApplicationContext());

        fellowsDatabaseHelper.addFellow(new Fellow("Lin", "Lily", "Spotify"));
        fellowsDatabaseHelper.addFellow(new Fellow("Lin", "Lily", "Spotify"));
        fellowsDatabaseHelper.addFellow(new Fellow("Smith", "Jordan", "LinkedIn"));
        fellowsDatabaseHelper.addFellow(new Fellow("Li", "Rusi", "Weight Watchers"));
        fellowsDatabaseHelper.addFellow(new Fellow("Santos", "Derek", "Uber"));
        fellowsDatabaseHelper.addFellow(new Fellow("Lui", "Danny", "Max2"));

        List<Fellow> fellows = fellowsDatabaseHelper.getFellowList();

        for(Fellow f : fellows) {
            Log.d("Fellows? ", f.getFirstName() + " " + f.getLastName() + " - " + f.getCompany());
        }


    }
}
