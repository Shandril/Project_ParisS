package com.example.manu_.paris_story;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by manu_ on 06/12/2016.
 */
public class Envoyer extends Activity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        // On récupère l'intent qui a lancé cette activité
        Intent i = getIntent();

        TextView text = new TextView(this);
        text.setText("Bonjour, ici vous pouvez envoyer par mail les monuments et parcours choisi.");
        setContentView(text);
    }
}