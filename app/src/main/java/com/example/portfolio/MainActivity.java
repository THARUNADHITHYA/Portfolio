package com.example.portfolio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.portfolio.cv.CVFragment;
import com.example.portfolio.home.HomeFragment;
import com.example.portfolio.team.TeamFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        //setCVfragment();
        //setHomeFragment();
        setTeamFragment();
    }

    void setTeamFragment()
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new TeamFragment()).commit();
    }

    void setCVfragment()
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new CVFragment()).commit();
    }

    void setHomeFragment()
    {
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new HomeFragment()).commit();
    }

}