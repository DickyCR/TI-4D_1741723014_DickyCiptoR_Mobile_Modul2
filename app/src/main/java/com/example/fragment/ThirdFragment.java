package com.example.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import java.util.Random;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ThirdFragment extends Fragment { View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {


        view =inflater.inflate(R.layout.fragment_third,container, false);
        view.setOnClickListener(new View.OnClickListener() { @Override

        public void onClick(View view) {
            Random rnd = new Random();
            int color = Color.argb(255, rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256));
            view.setBackgroundColor(color);
            Toast.makeText(getActivity(),"Third Fragment", Toast.LENGTH_LONG).show();
        }
        });
        return view;
    }
}

