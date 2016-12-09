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
public class Epoque extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.epoque_liste);
        // On récupère l'intent qui a lancé cette activité
        Intent i = getIntent();

        ListView mListView;
        mListView = (ListView) findViewById(R.id.listView);

        String[] liste= new String[]{
        "171 Epoque romaine\n" ,
        "172 Moyen  ge/ Roman\n" ,
        "173 Gothique\n" ,
        "174 Renaissance\n" ,
        "175 17ème Siècle Néo-classique\n" ,
        "176 18ème Siècle\n" ,
        "177 19ème siècle\n" ,
        "178 Belle Epoque (1880-1910)\n" ,
        "179 Entre deux guerres\n" ,
        "180 Contemporain\n" ,
        "181 Lutetia\n" ,
        "182 Enceinte Philippe Auguste (1210)\n" ,
        "183 Enceinte Charles V (1380)\n" ,
        "184 Enceinte des Fermiers Généraux (1784)\n" ,
        "185 Fortifications/Boulevards des Maréchaux\n"
        };

        setContentView(R.layout.epoque_liste);


        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Epoque.this,
                android.R.layout.simple_list_item_single_choice, liste);
        mListView.setAdapter(adapter);
        }

    }
