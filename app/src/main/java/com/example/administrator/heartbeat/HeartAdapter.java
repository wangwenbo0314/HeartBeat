package com.example.administrator.heartbeat;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by Administrator on 2017/5/8 0008.
 */

public class HeartAdapter extends RecyclerView.Adapter<HeartAdapter.ViewHolder> {
    private List<Personage> mPersonageList;


    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView heartImage;
        ImageView heartView;
        ImageView heart;
        View personageView;

        public ViewHolder(View view) {
            super(view);
            personageView = view;
            heartImage = (ImageView) view.findViewById(R.id.heart_name);
            heartView = (ImageView) view.findViewById(R.id.heart_view);
            heart = (ImageView) view.findViewById(R.id.heart_label);
        }
    }

    public HeartAdapter(List<Personage> personageList) {
        mPersonageList = personageList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.heartlayout,parent,false);
        final ViewHolder holder = new ViewHolder(view);
        holder.heartView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int position = holder.getAdapterPosition();
                Personage personage = mPersonageList.get(position);
                Intent intent = new Intent(v.getContext(),ImageActivity.class);
                intent.putExtra("heartViewId",personage.getHeartViewId());
                v.getContext().startActivity(intent);
            }
        });
        holder.heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.heart.setImageResource(R.mipmap.heartred);
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Personage personage = mPersonageList.get(position);
        holder.heartImage.setImageResource(personage.getHeartImageId());
        holder.heartView.setImageResource(personage.getHeartViewId());
        holder.heart.setImageResource(R.mipmap.heartwhite);
    }

    @Override
    public int getItemCount() {
        return mPersonageList.size();
    }

}
