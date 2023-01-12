package com.shahin.rentacar.fragments;


import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.shahin.rentacar.R;
import com.shahin.rentacar.adapters.NotificationAdapter;
import com.shahin.rentacar.models.NotificationModel;

import java.util.ArrayList;
import java.util.List;


public class NotificationsFragment extends Fragment {
    private Context mContext;

    View view;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;
    private NotificationAdapter notificationAdapter;
    private List<NotificationModel> notificationModelList;
    public NotificationsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_notifications, container, false);

        recyclerView    = view.findViewById(R.id.recyclerview_order);
        layoutManager   = new LinearLayoutManager(mContext);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(mContext, LinearLayoutManager.VERTICAL, false));
        recyclerView.setNestedScrollingEnabled(true);


        notificationModelList = new ArrayList<>();

        notificationModelList.add(new NotificationModel(R.drawable.bmw_m5_img, "Order No : #73ERT6265", "Order Confirmed" ));
        notificationModelList.add(new NotificationModel(R.drawable.car_img, "Order No : #632IOLK23", "Order Confirmed" ));
        notificationModelList.add(new NotificationModel(R.drawable.ford_mustang, "Order No : #632GY323", "Order Confirmed" ));
        notificationModelList.add(new NotificationModel(R.drawable.audi, "Order No : #632I323", "Order Confirmed" ));

        notificationAdapter = new NotificationAdapter(notificationModelList);
        recyclerView.setAdapter(notificationAdapter);

        return view;
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

}
