package com.example.manu_.paris_story;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by manu_ on 06/12/2016.
 */
public class ListParcours extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parcours_liste);
        // On récupère l'intent qui a lancé cette activité
        Intent i = getIntent();
        ListView mListView;
        mListView = (ListView) findViewById(R.id.listView);

        String[] liste= new String[]{
                "161 Promenade 1 Axe de la Seine\n" ,
                "162 Promenade 2 Rive Gauche\n" ,
                "163 Promenade 3 Halles Pompidou\n" ,
                "Bouton Vous êtes ici ! \n" ,
                "164 Promenade 4 Marais\n" ,
                "165 Promenade 5 Montmartre\n" ,
                "166 Promenade 6 Champs Elysées Palais de Chaillot Tour Eiffel\n"
        };

        setContentView(R.layout.parcours_liste);


        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListParcours.this,
                android.R.layout.simple_list_item_single_choice, liste);
        mListView.setAdapter(adapter);


    }
}
