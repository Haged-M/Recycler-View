package com.o_t.rycyclerview.kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.o_t.rycyclerview.R

class ContactAdapter(val contactList : List<Contact>? = null) : RecyclerView.Adapter<ContactAdapter.ContactViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ContactViewHolder {
        val context : Context = parent.context
        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ContactViewHolder,
        position: Int
    ) {
        val contact : Contact? = contactList?.get(position)
        holder.phoneNumber.text = contact?.phoneNumber
        holder.name.text = contact?.name
        holder.image.setImageResource(contact?.image ?: 0)

    }

    override fun getItemCount(): Int {
        return contactList?.size ?: 0
    }


    class ContactViewHolder(view : View) : RecyclerView.ViewHolder(view)
    {
        val phoneNumber : TextView = view.findViewById(R.id.contact_number)
        val name : TextView = view.findViewById(R.id.contact_name)
        val image : ImageView = view.findViewById(R.id.contact_image)


    }
}