package com.mobilization;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.mobilization.first.HomeFragment;
import com.mobilization.second.SecondFragment;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new HomeFragment()).commit();
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.navigation_item_1) {
            getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new HomeFragment()).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }
        if (itemId == R.id.navigation_item_2) {
            getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new SecondFragment()).commit();
            drawerLayout.closeDrawer(GravityCompat.START);
            return true;
        }
        return false;
    }
}
