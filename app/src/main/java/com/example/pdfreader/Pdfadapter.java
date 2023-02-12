package com.example.pdfreader;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.List;

public class Pdfadapter extends RecyclerView.Adapter<Pdfholder> {
    private Context contxt;
    private List<File> pdffile;
    private PdfSelected listener;

    public Pdfadapter(Context contxt, List<File> pdffile, PdfSelected listener) {
        this.contxt = contxt;
        this.pdffile = pdffile;
        this.listener = listener;
    }


    @NonNull
    @Override
    public Pdfholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Pdfholder(LayoutInflater.from(contxt).inflate(R.layout.elem_hold, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Pdfholder holder, int position) {
       holder.txtname.setText(pdffile.get(position).getName());
       holder.txtname.setSelected(true);

       holder.contain.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               listener.pdfselected(pdffile.get(position));
           }
       });
    }

    @Override
    public int getItemCount() {

        return pdffile.size();
    }
}
