package com.shahin.rentacar.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.shahin.rentacar.R;
import com.shahin.rentacar.models.CombinedVehicle;
import com.shahin.rentacar.models.RecentlyViewedVehicle;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class VehiclesAdapter extends RecyclerView.Adapter<VehiclesAdapter.ViewHolder> {

    Context context;
    List<RecentlyViewedVehicle> vehicleList;
    public VehiclesAdapter(Context context, List<RecentlyViewedVehicle> VehicleList) {
        this.context=context;
        this.vehicleList=VehicleList;
    }

    @NonNull
    @Override
    public VehiclesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.vehicle_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VehiclesAdapter.ViewHolder holder, int position) {

        holder.imageView.setImageResource(vehicleList.get(position).getVehicleImage());
        holder.circleImageView.setImageResource(vehicleList.get(position).getOwnerImage());
        holder.vehicleName.setText(vehicleList.get(position).getVehicleName());
        holder.vehicleName.setText(vehicleList.get(position).getVehicleName());
        holder.pricePerDay.setText(vehicleList.get(position).getPricePerDay()+"/day");
    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
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
