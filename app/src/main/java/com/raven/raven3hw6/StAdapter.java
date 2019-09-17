package com.raven.raven3hw6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StAdapter extends RecyclerView.Adapter<StViewHolder> {

    ArrayList<StudentTask>studentTasks;
    public StAdapter(){
        studentTasks = new ArrayList<>();

    }
    @NonNull
    @Override
    public StViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.view_holder_st, parent,false);
        return new StViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StViewHolder holder, int position) {
        holder.onBind(studentTasks.get(position));

    }

    @Override
    public int getItemCount() {
        return studentTasks.size();
    }
}
