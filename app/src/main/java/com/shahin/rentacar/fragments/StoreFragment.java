package com.shahin.rentacar.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.shahin.rentacar.R;
import com.shahin.rentacar.adapters.VehiclesAdapter;
import com.shahin.rentacar.models.RecentlyViewedVehicle;

import java.util.ArrayList;
import java.util.List;


public class StoreFragment extends Fragment {

    View view;
    List<RecentlyViewedVehicle> recentlyViewedVehicleList = new ArrayList<>();

    RecyclerView recyclerView;

    LinearLayoutManager linearLayoutManager;
    public StoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_store, container, false);
        recyclerView=view.findViewById(R.id.recyclerview_cars);


//                Toolbar toolbar = view.findViewById(R.id.toolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);

        init();

        return view;
    }
    private void init() {



        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Mercedes-Benz SLS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_g,R.drawable.bmw_user_img, "250"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Audi A8 2020", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.ford_mustang,R.drawable.ford_user_img, "240"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("2019 • COMFORT CLASS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.audi,R.drawable.audi_user_img, "210"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Ford Mustang GT", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.mercedes,R.drawable.mercedes_user_img, "200"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Vespa Rechargeable", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.bmw_m5_img,R.drawable.user_img, "270"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Toyota Corolla", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_i,R.drawable.mercedes_user_img, "250"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Mercedes-Benz SLS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_e, R.drawable.bmw_user_img, "250"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Audi A8 2020", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_j, R.drawable.ford_user_img, "240"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("2019 • COMFORT CLASS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_k, R.drawable.audi_user_img, "210"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Ford Mustang GT", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_a, R.drawable.mercedes_user_img, "200"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Vespa Rechargeable", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_c, R.drawable.audi_user_img, "270"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Toyota Corolla", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_g, R.drawable.audi_user_img, "250"));

        GridLayoutManager layoutManager=new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        VehiclesAdapter vehiclesAdapter=new VehiclesAdapter(getContext(),recentlyViewedVehicleList);
        recyclerView.setAdapter(vehiclesAdapter);
    }
}
