package com.shahin.rentacar.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shahin.rentacar.R;

import java.util.List;

public class RecentlyViewedAdapter extends RecyclerView.Adapter<RecentlyViewedAdapter.ViewHolder> {
    List<RecentlyViewedVehicle> recentlyViewedVehicleList;
    Context context;
    public RecentlyViewedAdapter(Context context, List<RecentlyViewedVehicle> recentlyViewedVehicles) {
        this.recentlyViewedVehicleList=recentlyViewedVehicles;
        this.context=context;
    }

    @NonNull
    @Override
    public RecentlyViewedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.recently_viewed_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentlyViewedAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(recentlyViewedVehicleList.get(position).getVehicleImage());
    }

    @Override
    public int getItemCount() {
        return recentlyViewedVehicleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview_vehicle);
        }
    }
}
