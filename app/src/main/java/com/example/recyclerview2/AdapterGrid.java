package com.example.recyclerview2;

import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

class AdapterGrid extends RecyclerView.Adapter<AdapterGrid.ViewHolder> {

    Context context;
    String[] activityList = {"Activity Life-Cycle", "Sensors", "Implicit Intent",
            "Explicit Intent", "Fragments", "ListView",
            "AsyncTask", "Get Result From Activity", "abc"};

    static int[] colorList = {R.color.color1, R.color.color2, R.color.color3, R.color.color4, R.color.color5, R.color.color6, R.color.color7
            , R.color.color8, R.color.color9};


    public AdapterGrid(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_adapter_grid, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //  holder.txtCarName.setText(activityList[position]);
        // holder.cv.setCardBackgroundColor(context.getColor(colorList[position]));
    }

    @Override
    public int getItemCount() {
        return activityList.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtCarName;
        CardView cv;

        public ViewHolder(View view) {
            super(view);
            txtCarName = view.findViewById(R.id.textView);
            cv = view.findViewById(R.id.card_view);

            final MediaPlayer mp = MediaPlayer.create(context, R.raw.sound);
            final int color1 = ContextCompat.getColor(context, R.color.color1);
            final int color2 = ContextCompat.getColor(context, R.color.color2);
            final int color3 = ContextCompat.getColor(context, R.color.color3);
            final int color4 = ContextCompat.getColor(context, R.color.color4);
            final int color5 = ContextCompat.getColor(context, R.color.color5);
            final int color6 = ContextCompat.getColor(context, R.color.color6);
            final int color7 = ContextCompat.getColor(context, R.color.color7);
            final int color8 = ContextCompat.getColor(context, R.color.color8);
            final int color9 = ContextCompat.getColor(context, R.color.color9);



            cv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (getAdapterPosition() == 0) {
                        cv.setBackgroundColor(color1);
                        mp.start();
                    }
                    if (getAdapterPosition() == 1) {
                        cv.setBackgroundColor(color2);
                    }
                    if (getAdapterPosition() == 2) {
                        cv.setBackgroundColor(color3);
                    }
                    if (getAdapterPosition() == 3) {
                        cv.setBackgroundColor(color4);
                    }
                    if (getAdapterPosition() == 4) {
                        cv.setBackgroundColor(color5);
                    }
                    if (getAdapterPosition() == 5) {
                        cv.setBackgroundColor(color6);
                    }
                    if (getAdapterPosition() == 6) {
                        cv.setBackgroundColor(color7);
                    }
                    if (getAdapterPosition() == 7) {
                        cv.setBackgroundColor(color8);
                    }
                    if (getAdapterPosition() == 8) {
                        cv.setBackgroundColor(color9);
                    }
                }
            });
        }
    }
}

