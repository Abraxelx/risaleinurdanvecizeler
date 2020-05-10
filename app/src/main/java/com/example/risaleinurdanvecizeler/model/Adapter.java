package com.example.risaleinurdanvecizeler.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.risaleinurdanvecizeler.R;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Holder> {

    Context context;
    List<QuotesModel> models;

    public Adapter(Context context, List<QuotesModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row, null);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.mTitle.setText(models.get(position).getQuote());
        holder.mDescription.setText(models.get(position).getSource());
       // holder.mImageButton.setImageResource(models.get(position).getCategory());

    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}
