package com.example.fashionapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ImageViewHolder> {
    Context context;
    List<row> mData;

    //Constructor


    public RecyclerViewAdapter(Context context, List<row> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_item,parent,false);

        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
    //Binding image here

        Glide.with(context)
                .load(mData.get(position).getImage())
                .into(holder.img);

        //Binding TextView with Data
        holder.title.setText(mData.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    //  ImageViewHolder Class
    public class ImageViewHolder extends    RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView img;
        TextView title;
        Button btn;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imageView);
            title =itemView.findViewById(R.id.textView2);
            btn = itemView.findViewById(R.id.button);

            img.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            if(getAdapterPosition() == 0){
                Toast.makeText(context, "You Clicked the first Item", Toast.LENGTH_SHORT).show();
            }
        }
    }

}
