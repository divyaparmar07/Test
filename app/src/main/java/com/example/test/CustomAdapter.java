package com.example.test;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{

    ArrayList image,name,image1,name1;
    Context context;

    public CustomAdapter(Context context, ArrayList image,ArrayList name,ArrayList image1,ArrayList name1) {
        this.context = context;
        this.image = image;
        this.name = name;
        this.name1 = name1;
        this.image1 = image1;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_list, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.image.setImageResource((Integer) image.get(position));
        holder.name.setText("" + name.get(position));
        holder.image1.setImageResource((Integer) image1.get(position));
        holder.name1.setText("" + name1.get(position));
    }


    @Override
    public int getItemCount() {
        return name.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image,image1;// init the item view's
        TextView name,name1;
        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            image = (ImageView) itemView.findViewById(R.id.image);
            name = (TextView) itemView.findViewById(R.id.name);
            image1 = (ImageView) itemView.findViewById(R.id.image1);
            name1 = (TextView) itemView.findViewById(R.id.name1);
        }
    }
}