package com.shahin.rentacar.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.shahin.rentacar.R;
import com.shahin.rentacar.SectionsPagerAdapter;
import com.shahin.rentacar.adapters.CombinedAdapter;
import com.shahin.rentacar.models.CombinedVehicle;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {


    View view;

    RecyclerView recyclerViewCombined;
    CombinedAdapter combinedAdapter;
    List<CombinedVehicle> combinedVehicleList=new ArrayList<>();

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_home, container, false);
//        Toolbar toolbar = view.findViewById(R.id.toolbar);
//        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);


        combinedVehicleList.add(new CombinedVehicle("BMW X4 Sports","2019 • COMFORT CLASS","4.5","6","4","3",R.drawable.bmw_car_img,"250"));
        combinedVehicleList.add(new CombinedVehicle("Vespa Rechargeable","2019 • COMFORT CLASS","4.5","6","4","3",R.drawable.scooter1,"250"));
        combinedVehicleList.add(new CombinedVehicle("Toyota Corolla","2019 • COMFORT CLASS","4.5","6","4","3",R.drawable.corolla,"250"));
        combinedVehicleList.add(new CombinedVehicle("2019 • COMFORT CLASS","2019 • COMFORT CLASS","4.5","6","4","3",R.drawable.bmw_car_img,"250"));


        recyclerViewCombined = view.findViewById(R.id.combined_recyclerView);


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        recyclerViewCombined.setLayoutManager(linearLayoutManager);
        combinedAdapter = new CombinedAdapter(getContext(),combinedVehicleList);
        recyclerViewCombined.setAdapter(combinedAdapter);




        return view;
    }

}
