package com.o_t.rycyclerview.kotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.o_t.rycyclerview.R

class ContactsActivity : AppCompatActivity() {
    lateinit var contactRecyclerView: RecyclerView
    lateinit var contactList: MutableList<Contact>
    lateinit var adapter: ContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contactRecyclerView = findViewById(R.id.contact_recyclerView)
        createContactList()
        adapter = ContactAdapter(contactList)
        contactRecyclerView.adapter = adapter


    }

    private fun createContactList()
    {
        contactList = mutableListOf()

        for (i in 1..100)
        {
            contactList.add(Contact(image = R.drawable.user_profile, name = "Contact #$i", phoneNumber = "+2012722${(1563) * i}"))
        }
    }
}