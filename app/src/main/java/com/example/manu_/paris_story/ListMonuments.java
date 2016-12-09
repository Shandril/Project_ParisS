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
            setContentView(R.layout.monuments_liste);

            Intent i = getIntent();

            ListView mListView;
            mListView = (ListView) findViewById(R.id.listView);

            String[] liste = new String[]{
                    "3 Restaurant Musée Maxim’s\n" ,
                    "4 Jardin Albert kahn\n" ,
                    "5 Place de Catalogne\n" ,
                    "6 Château de Versailles\n" ,
                    "7 Place de Bagatelle\n" ,
                    "8 Maison de la radio\n" ,
                    "9 Place des Congrès\n" ,
                    "10 Musée Marmottan Monet\n" ,
                    "11 Musée du vin\n" ,
                    "12 Maison de Balzac\n" ,
                    "13 Palais de Chaillot\n" ,
                    "14 Musée de l’Homme\n" ,
                    "15 Théâtre des Champs Élysées\n" ,
                    "16 Grande Arche de la Défense\n" ,
                    "17 Arc de Triomphe\n" ,
                    "18 Palais de Tokyo\n" ,
                    "19 Statue de la Liberté\n" ,
                    "20 Statut de la Liberté\n" ,
                    "21 Ciné Aqua\n" ,
                    "22 Musée de la contrefaçon\n" ,
                    "23 Egout de paris\n" ,
                    "24 Croisières Seine\n" ,
                    "25 Cathédrale orthodoxe St Alexandre Nevski\n" ,
                    "26 Unesco\n" ,
                    "27 Gare saint Lazare\n" ,
                    "28 Musée quai Branly\n" ,
                    "29 Parc Monceau\n" ,
                    "30 Gare du Nord\n" ,
                    "31 Gare de l’Est\n" ,
                    "32 Ecole Militaire\n" ,
                    "33 Assemblée Nationale\n" ,
                    "34 Grand Palais, Palais de la découverte\n" ,
                    "35 Petit Palais\n" ,
                    "36 Musée Nissim de Camondo\n" ,
                    "37 Musée Dapper\n" ,
                    "38 Musée Cernuschi\n" ,
                    "39 Musée des Invalides\n" ,
                    "40 Musée Rodin\n" ,
                    "41 Palais de l’Élysée\n" ,
                    "42 Musée Jacquemart André\n" ,
                    "43 Champs Élysées\n" ,
                    "44 St Augustin\n" ,
                    "45 Musée de la poste\n" ,
                    "46 Jardin des Tuileries\n" ,
                    "47 Musée du Jeu de paume\n" ,
                    "48 Musée de l’Orangerie\n" ,
                    "49 Eglise de la Madeleine\n" ,
                    "50 Musée Guimet arts asiatiques\n" ,
                    "51 Gare Montparnasse\n" ,
                    "52 Opéra Garnier\n" ,
                    "53 Ile St Louis\n" ,
                    "54 Place de la Concorde\n" ,
                    "55 Opéra Comique\n" ,
                    "56 Musée du Parfum Fragonard\n" ,
                    "57 Stade de France\n" ,
                    "58 Pont Alexandre III\n" ,
                    "59 Place et Colonne Vendôme\n" ,
                    "60 Place des Victoires\n" ,
                    "61 Place Pigalle\n" ,
                    "62 Musée Gustave Moreau\n" ,
                    "63 Bourse\n" ,
                    "64 Tour Montparnasse\n" ,
                    "65 Tour Eiffel\n" ,
                    "66 St Germain l’Auxerrois\n" ,
                    "67 Musée de la Légion d’Honneur\n" ,
                    "68 Folies Bergère\n" ,
                    "69 Musée d’Orsay\n" ,
                    "70 Odéon théâtre national\n" ,
                    "71 Musée des Arts décoratifs\n" ,
                    "72 Espace Dali\n" ,
                    "73 Arc de Triomphe du Carrousel\n" ,
                    "74 St Germain des Prés\n" ,
                    "75 Musée Zadkine\n" ,
                    "76 Musée de la Monnaie\n" ,
                    "77 St Eustache\n" ,
                    "78 Académie Française\n" ,
                    "79 Palais du Luxembourg\n" ,
                    "80 Observatoire de Paris\n" ,
                    "81 Musée Eugène Delacroix, Place Furstenberg\n" ,
                    "82 Catacombes\n" ,
                    "83 Musée du Louvre\n" ,
                    "84 Val de Grâce\n" ,
                    "85 Musée Bourdelle\n" ,
                    "86 Palais Royal, Comédie française, Conseil d’Etat\n" ,
                    "87 Manufacture des Gobelins\n" ,
                    "88 Basilique Saint Denis\n" ,
                    "89 Forum des Halles\n" ,
                    "90 Musée Picasso\n" ,
                    "91 Musée des Sciences et Techniques\n" ,
                    "92 Tour Saint Jacques\n" ,
                    "93 Musée du Vieux Montmartre\n" ,
                    "94 Hôtel de Ville\n" ,
                    "95 Pont Neuf\n" ,
                    "96 Passerelle des Arts\n" ,
                    "97 Musée Grévin\n" ,
                    "98 Musée de la vie romantique\n" ,
                    "99 Place du Châtelet\n" ,
                    "100 Conciergerie\n" ,
                    "101 Palais de Justice\n" ,
                    "102 Musée d’Art et d’Histoire du Judaïsme\n" ,
                    "103 Centre Pompidou, Musée d’Art Moderne\n" ,
                    "104 Hôtel de Soubise\n" ,
                    "105 Place St Michel\n" ,
                    "106 Sacré Cœur\n" ,
                    "107 Musée Carnavalet\n" ,
                    "108 Marché aux puces\n" ,
                    "109 Musée Cognacq Jay\n" ,
                    "110 Place Dauphine\n" ,
                    "111 Panthéon\n" ,
                    "112 Musée du Moyen- ge, Thermes de Cluny\n" ,
                    "113 Mosquée de Paris\n" ,
                    "114 Place des Vosges\n" ,
                    "115 Hôtel de Sully\n" ,
                    "116 Saint Chapelle\n" ,
                    "118 Cité Universitaire de Paris\n" ,
                    "119 Notre Dame de Paris\n" ,
                    "120 St Etienne du Mont\n" ,
                    "121 Maison de Victor Hugo\n" ,
                    "122 Colonne de Juillet, Bastille\n" ,
                    "123 Saint Sulpice et Fontaine\n" ,
                    "124 Hôtel de Sens\n" ,
                    "125 Bibliothèque de la ville de Paris\n" ,
                    "126 Bassin de l’Arsenal\n" ,
                    "127 Croisières canaux\n" ,
                    "128 Institut du Monde Arabe\n" ,
                    "129 Mémorial du Martyr juif inconnu\n" ,
                    "130 Université de la Sorbonne\n" ,
                    "131 Pavillon de l’Arsenal, Architecture de Paris\n" ,
                    "132 Musée des statues en plein air\n" ,
                    "133 Faculté des Sciences de Jussieu\n" ,
                    "134 Musée d’Histoire Naturelle\n" ,
                    "135 Saint Julien le Pauvre\n" ,
                    "136 Viaduc des Arts\n" ,
                    "137 St Gervais\n" ,
                    "138 Office du Tourisme\n" ,
                    "139 Opéra Bastille\n" ,
                    "140 Tour Jean sans peur\n" ,
                    "141 Saint Martin des Champs\n" ,
                    "142 Arène de Lutèce\n" ,
                    "143 Palais Omnisport de Bercy\n" ,
                    "144 Saint Séverin\n" ,
                    "145 Saint Pierre de Montmartre\n" ,
                    "146 Ministère des Finances\n" ,
                    "147 Cité de la musique\n" ,
                    "148 Cité des Sciences Géode\n" ,
                    "149 Gare d’Austerlitz\n" ,
                    "150 Cinémathèque\n" ,
                    "151 Bibliothèque Nationale de France\n" ,
                    "152 Parc des Buttes Chaumont\n" ,
                    "153 Cimetière du Père Lachaise\n" ,
                    "155 Château de Vincennes\n" ,
                    "156 Château de Vaux le Vicomte\n" ,
                    "157 Musée de l’Histoire de l’immigration"
            };

            setContentView(R.layout.monuments_liste);


                mListView = (ListView) findViewById(R.id.listView);
                ArrayAdapter<String> adapter = new ArrayAdapter<String>(ListMonuments.this,
                        android.R.layout.simple_list_item_single_choice, liste);
                mListView.setAdapter(adapter);


            }


        }





