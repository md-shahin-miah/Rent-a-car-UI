package com.shahin.rentacar.models;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shahin.rentacar.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecentlyViewedAdapter extends RecyclerView.Adapter<RecentlyViewedAdapter.ViewHolder> {
    List<RecentlyViewedVehicle> recentlyViewedVehicleList;
    Context context;

    public RecentlyViewedAdapter(Context context, List<RecentlyViewedVehicle> recentlyViewedVehicles) {
        this.recentlyViewedVehicleList = recentlyViewedVehicles;
        this.context = context;
    }

    @NonNull
    @Override
    public RecentlyViewedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recently_viewed_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentlyViewedAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(recentlyViewedVehicleList.get(position).getVehicleImage());
        holder.circleImageView.setImageResource(recentlyViewedVehicleList.get(position).getOwnerImage());
        holder.vehicleName.setText(recentlyViewedVehicleList.get(position).getVehicleName());
        holder.vehicleName.setText(recentlyViewedVehicleList.get(position).getVehicleName());
        holder.pricePerDay.setText(recentlyViewedVehicleList.get(position).getPricePerDay()+"/day");
    }

    @Override
    public int getItemCount() {
        return recentlyViewedVehicleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        CircleImageView circleImageView;
        TextView vehicleName,vehicleLocation,pricePerDay;





        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageview_vehicle);
            circleImageView = itemView.findViewById(R.id.profileImage);
            vehicleName = itemView.findViewById(R.id.vehicleName);
            vehicleLocation = itemView.findViewById(R.id.description);
            pricePerDay = itemView.findViewById(R.id.amount_tv);
        }
    }
}
