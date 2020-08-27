package com.example.urineanalyzer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.urineanalyzer.fragment.InspectionFragment;
import com.example.urineanalyzer.fragment.SettingFragment;
import com.example.urineanalyzer.fragment.calendarFragment;
import com.example.urineanalyzer.fragment.BluetoothFragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BluetoothFragment frag_bluetooth = new BluetoothFragment();;
    private InspectionFragment frag_Inspection = new InspectionFragment();
    private calendarFragment frag_claendar = new calendarFragment();
    private SettingFragment frag_setting = new SettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigationview);



        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {

                switch (menuItem.getItemId())
                {
                    case R.id.action_bluetooth:
                        setFrag(0);
                        break;
                    case R.id.action_inspection:
                        setFrag(1);
                        break;
                    case R.id.action_calenddar:
                        setFrag(2);
                        break;
                    case R.id.action_settings:
                        setFrag(3);
                        break;
                }
                return true;
            }
        });

        setFrag(0); // 첫 프래그먼트 화면 지정
    }

    // 프레그먼트 교체
    private void setFrag(int n)
    {
        FragmentManager fragmentmanager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentmanager.beginTransaction();
        switch (n)
        {
            case 0:
                transaction .replace(R.id.main_framelayout,frag_bluetooth);
                transaction .commit();
                break;

            case 1:
                transaction .replace(R.id.main_framelayout,frag_Inspection);
                transaction .commit();
                break;

            case 2:
                transaction .replace(R.id.main_framelayout,frag_claendar);
                transaction .commit();
                break;

            case 3:
                transaction .replace(R.id.main_framelayout,frag_setting);
                transaction .commit();
                break;



        }
    }

}