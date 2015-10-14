package com.mobilization;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;

import com.mobilization.dummy.SelectorInitializer;
import com.mobilization.first.FirstFragment;

public class HomeActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        regularInitialStuff();
    }

    private void regularInitialStuff() {
        setContentView(R.layout.home_activity);
        SelectorInitializer.initDummySelector(this);
        getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new FirstFragment()).commit();
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }
}
