package com.shahin.rentacar.fragments;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shahin.rentacar.R;
import com.shahin.rentacar.adapters.CombinedAdapter;
import com.shahin.rentacar.adapters.TendingAdapter;
import com.shahin.rentacar.models.CombinedVehicle;
import com.shahin.rentacar.models.RecentlyViewedAdapter;
import com.shahin.rentacar.models.RecentlyViewedVehicle;
import com.shahin.rentacar.models.TrendingVehicle;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {


    View view;

    RecyclerView recyclerViewCombined, recyclerViewTrending,recyclerViewRecentlyViewed;
    CombinedAdapter combinedAdapter;
    TendingAdapter trendingVehicle;
    RecentlyViewedAdapter recentlyViewedAdapter;
    List<CombinedVehicle> combinedVehicleList = new ArrayList<>();
    List<TrendingVehicle> trendingVehicleList = new ArrayList<>();
    List<RecentlyViewedVehicle> recentlyViewedVehicleList = new ArrayList<>();
    LinearLayoutManager linearLayoutManager;
    LinearLayoutManager linearLayoutManagerTrending;
    LinearLayoutManager linearLayoutRecentlyViewed;
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

        recyclerViewCombined = view.findViewById(R.id.combined_recyclerView);
        recyclerViewTrending = view.findViewById(R.id.trending_recyclerView);
        recyclerViewRecentlyViewed = view.findViewById(R.id.recentlyViewed_recyclerView);


        combinedVehicleList.add(new CombinedVehicle("BMW X4 Sports", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_c, "250"));
        combinedVehicleList.add(new CombinedVehicle("Vespa Rechargeable", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.scooter1, "250"));
        combinedVehicleList.add(new CombinedVehicle("Toyota Corolla", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_a, "250"));
        combinedVehicleList.add(new CombinedVehicle("2019 • COMFORT CLASS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_e, "250"));
        combinedVehicleList.add(new CombinedVehicle("BMW X4 Sports", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_g, "250"));
        combinedVehicleList.add(new CombinedVehicle("Vespa Rechargeable", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.scooter1, "250"));
        combinedVehicleList.add(new CombinedVehicle("Toyota Corolla", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.corolla, "250"));
        combinedVehicleList.add(new CombinedVehicle("2019 • COMFORT CLASS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.bmw_car_img, "250"));





        linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        recyclerViewCombined.setLayoutManager(linearLayoutManager);
        combinedAdapter = new CombinedAdapter(getContext(), combinedVehicleList);
        recyclerViewCombined.setAdapter(combinedAdapter);






        trendingVehicleList.add(new TrendingVehicle("Vespa Rechargeable", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_named_a, "250"));
        trendingVehicleList.add(new TrendingVehicle("Toyota Corolla", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.truck_named_a, "250"));
        trendingVehicleList.add(new TrendingVehicle("2019 • COMFORT CLASS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.car_named_b, "250"));
        trendingVehicleList.add(new TrendingVehicle("2019 • COMFORT CLASS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.truck_named_b, "250"));
        trendingVehicleList.add(new TrendingVehicle("Vespa Rechargeable", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.truck_named_c, "250"));
        trendingVehicleList.add(new TrendingVehicle("Toyota Corolla", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.show_bikes_img, "250"));


        linearLayoutManagerTrending = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        recyclerViewTrending.setLayoutManager(linearLayoutManagerTrending);
        trendingVehicle = new TendingAdapter(getContext(), trendingVehicleList);
        recyclerViewTrending.setAdapter(trendingVehicle);

        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Mercedes-Benz SLS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.mercedes,R.drawable.bmw_user_img, "250"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Audi A8 2020", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.audi,R.drawable.ford_user_img, "240"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("2019 • COMFORT CLASS", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.ford_mustang,R.drawable.audi_user_img, "210"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Ford Mustang GT", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.mercedes,R.drawable.mercedes_user_img, "200"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Vespa Rechargeable", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.audi,R.drawable.user_img, "270"));
        recentlyViewedVehicleList.add(new RecentlyViewedVehicle("Toyota Corolla", "2019 • COMFORT CLASS", "4.5", "6", "4", "3", R.drawable.ford_mustang,R.drawable.bmw_m5_img, "250"));


        linearLayoutRecentlyViewed = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        recyclerViewRecentlyViewed.setLayoutManager(linearLayoutRecentlyViewed);
        recentlyViewedAdapter = new RecentlyViewedAdapter(getContext(), recentlyViewedVehicleList);
        recyclerViewRecentlyViewed.setAdapter(recentlyViewedAdapter);


        return view;
    }

}
