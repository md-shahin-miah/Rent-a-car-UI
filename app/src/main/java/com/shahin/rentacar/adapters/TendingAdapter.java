package com.shahin.rentacar.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shahin.rentacar.R;
import com.shahin.rentacar.models.CombinedVehicle;
import com.shahin.rentacar.models.TrendingVehicle;

import java.util.List;

public class TendingAdapter extends RecyclerView.Adapter<TendingAdapter.ViewHolder> {

    Context context;
    List<TrendingVehicle> trendingVehicleList;
    public TendingAdapter(Context context,List<TrendingVehicle> trendingVehicleList) {
        this.trendingVehicleList=trendingVehicleList;

        this.context=context;


    }

    @NonNull
    @Override
    public TendingAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.trending_layout_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TendingAdapter.ViewHolder holder, int position) {


        holder.imageView.setImageResource(trendingVehicleList.get(position).getVehicleImage());

    }

    @Override
    public int getItemCount() {
        return trendingVehicleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageview_car);

        }
    }
}
