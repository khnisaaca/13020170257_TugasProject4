package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PahlawanAdapter extends RecyclerView.Adapter<PahlawanAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<Pahlawan> data;

    public PahlawanAdapter(Context context, ArrayList<Pahlawan> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_pahlawan, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Pahlawan p = data.get(position);
        holder.nama.setText(p.getNama());
        holder.desc.setText(p.getDesc());
        holder.photo.setImageResource(p.getPhoto());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView nama, desc;
        private ImageView photo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            nama = itemView.findViewById(R.id.text_nama);
            desc = itemView.findViewById(R.id.text_desc);
            photo = itemView.findViewById(R.id.img_photo);
        }
    }
}
