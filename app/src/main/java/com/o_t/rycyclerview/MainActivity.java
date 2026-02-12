package com.o_t.rycyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecyclerView;
    private ContactsAdapter adapter;
    private ArrayList<Contact> contactsList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        createDummyData();
        contactsRecyclerView = findViewById(R.id.contact_recyclerView);
        adapter = new ContactsAdapter(contactsList);
        contactsRecyclerView.setAdapter(adapter);
    }

    private void createDummyData()
    {
        contactsList = new ArrayList<>();
        contactsList.add(new Contact("Mohamed", "012084923", R.drawable.user_profile));
        for (int i = 0 ; i < 1000 ; i++)
        {
            contactsList.add(new Contact("Contact Name#" + i , "012084" + (65*i), R.drawable.user_profile));
        }
    }
}