package com.example.manu_.paris_story;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.TextView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.id;
import static com.example.manu_.paris_story.R.string.list_monuments;

/**
 * Created by manu_ on 05/12/2016.
 */

public class ListMonuments extends Activity  {
    //private ListView mList_Monuments = null;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.content_main);

            Intent i = getIntent();

            TextView text = new TextView(this);
            text.setText("Bonjour, voici la liste des monuments de Paris :");
            setContentView(text);

           /*mList_Monuments = (ListView) findViewById(R.id.ListMonuments);

            List<String> listeM = new ArrayList<String>();
            listeM.add("Tour eiffel");
            listeM.add("Notre Dame de Paris");
            listeM.add("les champs élysées");

            ArrayAdapter<String> adapter= new ArrayAdapter(this, android.R.layout.simple_list_item_single_choice, listeM);
            mList_Monuments.setAdapter(adapter);*/


            }

   /* public void onClick(View v){
         Toast.makeText(ListMonuments.this, " regardez sur la maquette où cela se situe !", Toast.LENGTH_LONG).show();
        }*/

        }





