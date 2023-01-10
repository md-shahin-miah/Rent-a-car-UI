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

import java.util.List;

public class CombinedAdapter extends RecyclerView.Adapter<CombinedAdapter.ViewHolder> {


    Context context;
    List<CombinedVehicle> combinedVehicleList;
    public CombinedAdapter(Context context, List<CombinedVehicle> combinedVehicleList) {

        this.context = context;
        this.combinedVehicleList = combinedVehicleList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.combined_layout_item_copy, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        CombinedVehicle combinedVehicle=combinedVehicleList.get(position);

        holder.amountPerDay.setText(combinedVehicle.getPricePerDay());
        holder.seat.setText(combinedVehicle.getSeat());
        holder.bag.setText(combinedVehicle.getBag());
        holder.door.setText(combinedVehicle.getGate());
        holder.vehicleName.setText(combinedVehicle.getVehicleName());
        holder.description.setText(combinedVehicle.getVehicleDescription());
        holder.imageViewCar.setImageResource(combinedVehicle.getVehicleImage());







    }

    @Override
    public int getItemCount() {
        return combinedVehicleList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView vehicleName,rating,description,door,seat,bag,amountPerDay,bookTVButton;
        ImageView imageViewCar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            vehicleName=itemView.findViewById(R.id.vehicleName);
            rating=itemView.findViewById(R.id.ratingPoint);
            description=itemView.findViewById(R.id.description);
            door=itemView.findViewById(R.id.door);
            seat=itemView.findViewById(R.id.seat);
            bag=itemView.findViewById(R.id.bag);
            amountPerDay=itemView.findViewById(R.id.amount_tv);
            imageViewCar=itemView.findViewById(R.id.imageview_car);
            bookTVButton=itemView.findViewById(R.id.book_tv_button);


        }
    }
}
