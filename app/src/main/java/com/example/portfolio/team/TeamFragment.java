package com.example.portfolio.team;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.portfolio.R;

import java.util.ArrayList;
import java.util.List;


public class TeamFragment extends Fragment {

    RecyclerView RvTeam;
    TeamAdapter adapter;
    List<TeamItem>mdata;


    public TeamFragment()
    {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_team, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        RvTeam=view.findViewById(R.id.rv_team);

        TeamItem item = new TeamItem("John Dev",getString(R.string.lorem_text2),R.drawable.user);
        TeamItem item2 = new TeamItem("Arun Das",getString(R.string.lorem_text2),R.drawable.uservoyager);
        TeamItem item3 = new TeamItem("Kireon Mark",getString(R.string.lorem_text2),R.drawable.userspace);


        mdata = new ArrayList<>();
        mdata.add(item);
        mdata.add(item2);
        mdata.add(item3);


        RvTeam.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter = new TeamAdapter(mdata);
        RvTeam.setAdapter(adapter);

    }
}