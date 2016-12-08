package com.example.manu_.paris_story;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by manu_ on 06/12/2016.
 */
public class Parametres extends Activity{


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        // On récupère l'intent qui a lancé cette activité
        Intent i = getIntent();

        TextView text = new TextView(this);
        text.setText("Bonjour, vous êtes dans les paramètres de l'application Paris Story.");
        setContentView(text);
    }

}
