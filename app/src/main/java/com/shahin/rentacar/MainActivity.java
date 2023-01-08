package com.shahin.rentacar;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.shahin.rentacar.fragments.HomeFragment;
import com.shahin.rentacar.fragments.NotificationsFragment;
import com.shahin.rentacar.fragments.ProfileFragment;
import com.shahin.rentacar.fragments.StoreFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
//        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> { // using lamda

            Log.d(TAG, "onCreate: item "+item.toString());
            Fragment fragment = null;

            switch (item.getItemId()) {
                case R.id.nav_menu_home:
                    fragment = new HomeFragment();
                    break;
                case R.id.nav_menu_store:
                    fragment = new StoreFragment();
                    break;
                case R.id.nav_menu_notification:
                    fragment = new NotificationsFragment();
                    break;
                case R.id.nav_menu_profile:
                    fragment = new ProfileFragment();
                    break;
            }
            return loadFragment(fragment);
        });

        loadFragment(new HomeFragment());

    }
    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

}