package com.o_t.rycyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {

    ArrayList<Contact> contactList;

    public ContactsAdapter(ArrayList<Contact> contactList) {
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View itemView = inflater.inflate(R.layout.item_contact, parent, false);
        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.contactImage.setImageResource(contact.getImage());
        holder.contactName.setText(contact.getName());
        holder.contactPhoneNumber.setText(contact.getPhoneNumber());
    }

    @Override
    public int getItemCount() {
        if(contactList == null)
            return 0;
        return contactList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView contactName;
        TextView contactPhoneNumber;
        ImageView contactImage;

        ContactViewHolder(View itemView)
        {
            super(itemView);

            contactName = itemView.findViewById(R.id.contact_name);
            contactImage = itemView.findViewById(R.id.contact_image);
            contactPhoneNumber = itemView.findViewById(R.id.contact_number);
        }
    }
}
