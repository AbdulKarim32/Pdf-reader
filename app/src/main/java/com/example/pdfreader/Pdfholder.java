package com.example.pdfreader;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class Pdfholder extends RecyclerView.ViewHolder {
    public TextView txtname;
    public CardView contain;
    public Pdfholder(@NonNull View itmView){
        super(itmView);
        txtname = itmView.findViewById(R.id.txtpdf);
        contain = itmView.findViewById(R.id.Contain);
    }
}
