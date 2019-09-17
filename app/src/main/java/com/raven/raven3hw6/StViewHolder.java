package com.raven.raven3hw6;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView infor;
    public StViewHolder(@NonNull View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.student_name);
        infor = itemView.findViewById(R.id.info);
    }

    public void onBind(StudentTask stT){
        name.setText(stT.name);
        infor.setText(stT.inform );
    }
}
