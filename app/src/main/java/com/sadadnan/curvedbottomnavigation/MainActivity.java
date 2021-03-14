package com.sadadnan.curvedbottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sadadnan.curvedbottomnavigationlib.CurvedBottomNavigation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CurvedBottomNavigation curvedBottomNavigation = findViewById(R.id.custom);
        curvedBottomNavigation.inflateMenu(R.menu.bottom_menu);
//        curvedBottomNavigation.setBackgroundColor(getResources().getColor(R.color.white));
    }
}