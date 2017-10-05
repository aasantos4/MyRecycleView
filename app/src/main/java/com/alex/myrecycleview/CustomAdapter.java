package com.alex.myrecycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by aasantos4 on 10/09/2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {
    Context c;
    ArrayList<AndroidVersion> androidVersionArrayList;

    public CustomAdapter(Context c, ArrayList<AndroidVersion> androidVersionArrayList) {
        this.c = c;
        this.androidVersionArrayList = androidVersionArrayList;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        CustomViewHolder customViewHolder = new CustomViewHolder(v, c, androidVersionArrayList);
        return customViewHolder;
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int i) {
        holder.logo.setImageResource(androidVersionArrayList.get(i).getId());
        holder.codeName.setText(androidVersionArrayList.get(i).getCodeName());
        holder.version.setText(androidVersionArrayList.get(i).getVersion());
        holder.api.setText(androidVersionArrayList.get(i).getApi());
        holder.date.setText(androidVersionArrayList.get(i).getReleaseDate());
    }

    @Override
    public int getItemCount() {
        return androidVersionArrayList.size();
    }

    public static class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView logo;
        TextView codeName, version, api, date;
        Context c;
        ArrayList<AndroidVersion> versions;

        public CustomViewHolder(View itemView, Context c, ArrayList<AndroidVersion> versions) {
            super(itemView);
            this.c = c;
            this.versions = versions;
            logo = (ImageView) itemView.findViewById(R.id.ivLogo);
            codeName = (TextView) itemView.findViewById(R.id.tvCodeName);
            version = (TextView) itemView.findViewById(R.id.tvVersion);
            api = (TextView) itemView.findViewById(R.id.tvApi);
            date = (TextView) itemView.findViewById(R.id.tvDate);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {
            int i = getAdapterPosition();
            String msg = "You clicked " + versions.get(i).getCodeName()
                    + " " + versions.get(i).getReleaseDate();
            Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
        }
    }
}
