package com.example.fragmentpractice;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MultipleFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_bridge);
        setTitle("Fragment Leaning");
    }
    public void fragPractice (View view){
        Fragment fragment;
        if(view == findViewById(R.id.button1))
        {
        fragment= new FragmentOne();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft= fm.beginTransaction();
        ft.replace(R.id.Fragment_in_ui,fragment);
        ft.commit();
         }

        if(view==findViewById(R.id.button2)){
            fragment =new two();
            FragmentManager fm =getSupportFragmentManager();
            FragmentTransaction ft=fm.beginTransaction();
            ft.replace(R.id.Fragment_in_ui,fragment);
            ft.commit();
        }
    }
}
