package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    static RecyclerView gv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gv=findViewById(R.id.recycle_grid);
        gv.setLayoutManager(new GridLayoutManager(this,3));
        AdapterGrid adapter = new AdapterGrid(this);
        gv.setItemAnimator(new DefaultItemAnimator());
        gv.setAdapter(adapter);
    }
}
