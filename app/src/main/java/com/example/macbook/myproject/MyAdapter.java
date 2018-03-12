package com.example.macbook.myproject;

import android.content.Context;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.macbook.myproject.Model.Contact;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private List<Contact> contactList;


    public MyAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Contact contact = contactList.get(position);
        holder.name.setText(contact.getName());
        holder.userCategory.setText(contact.getUserCategory());
        holder.products = contact.getProducts();
        holder.country = contact.getCountry();
        holder.email = contact.getEmail();
        holder.image = contact.getUserImage();
        holder.socImage = contact.getSocialImage();


        Glide.with(context)
                .load(contact.getUserImage())
                .into(holder.userImage);


        Glide.with(context)
                .load(contact.getSocialImage())
                .into(holder.socialImage);

    }


    @Override
    public int getItemCount() {
        {
            return contactList.isEmpty() ? 0 : contactList.size();
        }
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView name;
        private TextView userCategoryTitle;
        private TextView userCategory;
        private CircleImageView userImage;
        private ImageView socialImage;
        String products;
        String country;
        String email;
        int image;
        int socImage;


        public ViewHolder(View itemView) {

            super(itemView);

            itemView.setOnClickListener(this);

            name = itemView.findViewById(R.id.name);
            userCategoryTitle = itemView.findViewById(R.id.category_of_user);
            userCategory = itemView.findViewById(R.id.user_category);
            userImage = itemView.findViewById(R.id.user_image);
            socialImage = itemView.findViewById(R.id.social_image);

        }


        @Override
        public void onClick(View v) {


        }
    }


}
