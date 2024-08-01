package com.example.nmcmobileapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class DynamicFragmentLoadActivity extends AppCompatActivity {

    Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_fragment_load);

        btn1 = findViewById(R.id.btnFirst);
        btn2 = findViewById(R.id.btnSecond);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment1 first = new Fragment1();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.myfragment,first);
                ft.commit();
            }
        });
    }
}