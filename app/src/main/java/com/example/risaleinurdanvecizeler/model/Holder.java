package com.example.risaleinurdanvecizeler.model;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.risaleinurdanvecizeler.R;

public class Holder extends RecyclerView.ViewHolder {

    ImageButton mImageButton;
    TextView mTitle, mDescription;

    public Holder(@NonNull View itemView) {
        super(itemView);

        this.mImageButton = itemView.findViewById(R.id.myImageButton);
        this.mTitle = itemView.findViewById(R.id.txtTitle);
        this.mDescription = itemView.findViewById(R.id.txtDescription);
    }
}
