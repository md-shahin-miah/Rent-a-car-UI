package com.shahin.rentacar.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shahin.rentacar.R;
import com.shahin.rentacar.adapters.VehiclesAdapter;
import com.shahin.rentacar.models.RecentlyViewedVehicle;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TrucksFragment extends Fragment {

    List<RecentlyViewedVehicle> recentlyViewedVehicleList = new ArrayList<>();

    RecyclerView recyclerView;

    LinearLayoutManager linearLayoutManager;

    public TrucksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_trucks, container, false);

        recyclerView=view.findViewById(R.id.recyclerview_cars);


        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Mercedes-Benz SLS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.bmw_m5_img,R.drawable.bmw_user_img, "250"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Audi A8 2020", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.ford_mustang,R.drawable.ford_user_img, "240"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("2019 • COMFORT CLASS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.audi,R.drawable.audi_user_img, "210"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Ford Mustang GT", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.mercedes,R.drawable.mercedes_user_img, "200"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Vespa Rechargeable", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.bmw_m5_img,R.drawable.bmw_m5_img, "270"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Toyota Corolla", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.audi,R.drawable.bmw_m5_img, "250"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Mercedes-Benz SLS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.bmw_m5_img, R.drawable.bmw_user_img, "250"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Audi A8 2020", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.ford_mustang, R.drawable.ford_user_img, "240"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("2019 • COMFORT CLASS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.audi, R.drawable.audi_user_img, "210"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Ford Mustang GT", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.mercedes, R.drawable.mercedes_user_img, "200"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Vespa Rechargeable", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.bmw_m5_img, R.drawable.bmw_m5_img, "270"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Toyota Corolla", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.audi, R.drawable.bmw_m5_img, "250"));

        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        VehiclesAdapter vehiclesAdapter=new VehiclesAdapter(getContext(),recentlyViewedVehicleList);
        recyclerView.setAdapter(vehiclesAdapter);

        return  view;
    }

}
