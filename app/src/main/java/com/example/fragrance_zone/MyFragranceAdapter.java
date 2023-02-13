package com.example.fragrance_zone;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


@SuppressLint("ViewConstructor")
public class MyFragranceAdapter extends RecyclerView.Adapter<MyFragranceAdapter.ViewHolder>{
    fragranceData[] fragranceData;
    Context context;
    public MyFragranceAdapter(fragranceData[] fragranceData, MainActivity activity) {
        this.fragranceData = fragranceData;
        this.context = activity;


    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.top_fragrance_list,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    final fragranceData myfragrancelist = fragranceData[position];
    holder.pername.setText(myfragrancelist.getPerfumeName());
    holder.perdetails.setText(myfragrancelist.getPerfumeDetails());
    holder.perfumeImage.setImageResource(Integer.parseInt(myfragrancelist.getMovieImage()));

    }

    @Override
    public int getItemCount() {
        return fragranceData.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView perfumeImage;
        TextView pername;
        TextView perdetails;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            perfumeImage = itemView.findViewById(R.id.imageview);
            pername = itemView.findViewById(R.id.pertitle);
            perdetails = itemView.findViewById(R.id.details);
        }
    }
}
