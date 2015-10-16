package com.mobilization;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.mobilization.dummy.SelectorInitializer;
import com.mobilization.first.FirstFragment;
import com.mobilization.second.SecondFragment;

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

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener(new FragmentReplacer());
    }

    private class FragmentReplacer implements NavigationView.OnNavigationItemSelectedListener {
        @Override
        public boolean onNavigationItemSelected(MenuItem menuItem) {
            if (menuItem.getItemId() == R.id.select_first) {
                getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new FirstFragment()).commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
            if (menuItem.getItemId() == R.id.select_second) {
                getSupportFragmentManager().beginTransaction().replace(R.id.home_fragment_container, new SecondFragment()).commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
            return false;
        }
    }
}
