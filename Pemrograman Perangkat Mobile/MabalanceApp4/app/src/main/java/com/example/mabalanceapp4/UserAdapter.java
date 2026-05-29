package com.example.mabalanceapp4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    Context context;
    ArrayList<ModelItem> list;

    public UserAdapter(Context context, ArrayList<ModelItem> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item, parent, false);
        return new UserViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        ModelItem user = list.get(position);

        holder.username.setText(user.getUsername());
        holder.nomorHP.setText(user.getNomorHP());
        holder.group.setText(user.getGroup());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView username, nomorHP, group;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);

            username = itemView.findViewById(R.id.textView);
            nomorHP = itemView.findViewById(R.id.textView2);
            group = itemView.findViewById(R.id.textView3);
        }
    }
}