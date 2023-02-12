package com.example.pdfreader;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.io.File;

public class DocActivity extends AppCompatActivity {
    String filepath = " ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc);

        PDFView pdfView = findViewById(R.id.pdfview);
        filepath = getIntent().getStringExtra("path");

        File file = new File(filepath);
        Uri path = Uri.fromFile(file);
        pdfView.fromUri(path).load();
    }
}