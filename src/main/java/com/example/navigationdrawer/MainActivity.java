package com.example.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawer;
    Toolbar toolbar;
    NavigationView nav;
    ActionBarDrawerToggle toggle;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer = findViewById(R.id.navDrawer);
        nav = findViewById(R.id.navView);
        toolbar = findViewById(R.id.navToolbar);
        setSupportActionBar(toolbar);

        toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.Open, R.string.Close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.colorWhite));
        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {

                    case R.id.about:
                        Toast.makeText(MainActivity.this, "About Item clicked", Toast.LENGTH_SHORT).show();
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.home:
                        Toast.makeText(MainActivity.this, "Home Item clicked", Toast.LENGTH_SHORT).show();
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.setting:
                        Toast.makeText(MainActivity.this, "Setting Item clicked", Toast.LENGTH_SHORT).show();
                        drawer.closeDrawer(GravityCompat.START);
                        break;
                    default:
                        break;
                }

                return false;
            }
        });

    }
}