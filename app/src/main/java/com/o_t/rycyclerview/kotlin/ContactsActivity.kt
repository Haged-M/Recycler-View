package com.o_t.rycyclerview.kotlin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.o_t.rycyclerview.OnContactClickListener
import com.o_t.rycyclerview.R
import com.o_t.rycyclerview.databinding.ActivityMainBinding

class ContactsActivity : AppCompatActivity() {
    lateinit var contactList: MutableList<Contact>

    lateinit var binding: ActivityMainBinding
    lateinit var adapter: ContactAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        createContactList()

        adapter = ContactAdapter(contactList)
        binding.contactRecyclerView.adapter = adapter



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