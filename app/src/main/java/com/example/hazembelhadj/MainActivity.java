package com.example.hazembelhadj;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Adapter adapter;
    Adapter adapterr;
    ArrayList<String> items;
    ArrayList<String> descr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        items.add("Spaguetti");
        items.add("Couscous");
        items.add("Lablabi");
        items.add("Pizza");
        items.add("Bsissa");
        items.add("Riz");
        descr = new ArrayList<>();
        descr.add("Les spaghetti ou spaghettis sont un plat de pâtes longues, fines et cylindriques. ");
        descr.add("Le couscous est d'une part une semoule de blé dur préparée à l'huile d'olive et d'autre part, une spécialité culinaire issue de la cuisine berbère, à base de couscous, de légumes, d'épices, d'huile d'olive et de viande ou de poisson.");
        descr.add("Le lablabi est un plat populaire en Tunisie, préparé à base de pois chiches, d'ail, de cumin ou de carvi, d'huile d'olive, de sel, de poivre et de la harissa. L'appellation vient du turc leblebi");
        descr.add("La pizza est une recette de cuisine traditionnelle de la cuisine italienne, originaire de Naples à base de galette de pâte à pain, garnie de divers mélanges d’ingrédients et cuite au four");
        descr.add("La bsissa est un mets originaire du Maghreb, plus précisément de Tunisie, de Libye et d'Algérie.");
        descr.add("Le riz est une céréale de la famille des Poacées, cultivée dans les régions tropicales, subtropicales et tempérées chaudes pour son fruit, ou caryopse, riche en amidon");

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this,items,descr);
        recyclerView.setAdapter(adapter);



    }
}
