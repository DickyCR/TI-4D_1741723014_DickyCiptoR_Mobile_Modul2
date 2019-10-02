package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        loadFragment(new FirstFragment(),R.id.frameLayout1);
        loadFragment(new SecondFragment(),R.id.frameLayout2);
        loadFragment(new ThirdFragment(),R.id.frameLayout3);

    }


    private void loadFragment (Fragment fragment,int id){
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction =
            fm.beginTransaction();
        fragmentTransaction.replace(id, fragment); fragmentTransaction.commit();
    }
}
