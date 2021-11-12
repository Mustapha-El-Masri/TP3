package com.example.hazembelhadj;

import android.content.Context;
import android.content.Intent;

import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    final int VIEW_TYPE_MESSAGE = 0;
    final int VIEW_TYPE_IMAGE = 1;

    LayoutInflater layoutInflater;
    List<String> items;
    List<String> descr;




    Adapter(Context context, List<String> items , List<String> descr ){
        this.layoutInflater = LayoutInflater.from(context);
        this.items = items;
        this.descr= descr;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i ) {
        View view = layoutInflater.inflate(R.layout.custoum_view,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i    ) {

        // bind the textview with data received

        String title = items.get(i);
        String description = descr.get(i);

        viewHolder.textTitle.setText(title);
        viewHolder.textDescription.setText(description);



        // similarly you can set new image for each card and descriptions



    }


    @Override
    public int getItemCount() {
        return items.size() + descr.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView textTitle,textDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(v.getContext(), com.example.hazembelhadj.Details.class);
                    i.putExtra("description",descr.get(getBindingAdapterPosition()));
                    v.getContext().startActivity(i);
                }
            });
            textTitle = itemView.findViewById(R.id.textTitle);
            textDescription = itemView.findViewById(R.id.textDesc);
        }
    }
}
