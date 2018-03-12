package com.example.macbook.myproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.macbook.myproject.Model.Contact;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    private Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        realm = Realm.getDefaultInstance();

        Toolbar toolbar = findViewById(R.id.toolbar_top);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayShowTitleEnabled(false);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(this, getContactsList());
        recyclerView.setAdapter(adapter);

    }





    private List<Contact> getContactsList() {

        List<Contact> contactsList = new ArrayList<>();

        contactsList.add(new Contact("Anna D. Bennet", " Lead", R.drawable.twitter, R.drawable.mask, "Gucci", "England", "AB@gmail.com"));
        contactsList.add(new Contact("Aaron Jones", " Lead", R.drawable.twitter, R.drawable.mask ,"Lorient", "USA", "AJ@gmail.com"));
        contactsList.add(new Contact("Ben Kawasaki", " Lead", R.drawable.facebook, R.drawable.mask, "Rolex", "Japan", "BK@gmail.com" ));
        contactsList.add(new Contact("Adam Morgan", " Lead", R.drawable.unsocial, R.drawable.mask, "Gucci", "Australia", "AM@gmail.com"));
        contactsList.add(new Contact("Anna D. Bennet", " Lead", R.drawable.facebook, R.drawable.mask, "DG", "Canada", "AB@gmail.com"));
        contactsList.add(new Contact("Aaron Jones", " Lead", R.drawable.twitter, R.drawable.mask, "LV", "Austria", "AJ@gmail.com"));
        contactsList.add(new Contact("Ben Kawasaki", " Lead", R.drawable.unsocial, R.drawable.mask, "Zara", "France", "BK@gmail.com"));
        contactsList.add(new Contact("Adam Morgan", " Lead", R.drawable.facebook, R.drawable.mask, "BMW", "Spain", "AM@gmail.com"));
        contactsList.add(new Contact("Anna D. Bennet", " Lead", R.drawable.twitter, R.drawable.mask, "Honda", "Italy", "AB@gmail.com"));
        contactsList.add(new Contact("Aaron Jones", " Lead", R.drawable.unsocial, R.drawable.mask, "Lexus", "Germany", "AJ@gmail.com"));
        contactsList.add(new Contact("Ben Kawasaki", " Lead", R.drawable.facebook, R.drawable.mask, "Apple", "Russia", "BK@gmail.com"));
        contactsList.add(new Contact("Adam Morgan", " Lead", R.drawable.unsocial, R.drawable.mask, "Mercedes", "Denmark", "AM@gmail.com"));

        return contactsList;
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();

    }


}
