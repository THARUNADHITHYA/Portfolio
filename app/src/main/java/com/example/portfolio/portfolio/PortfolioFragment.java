package com.example.portfolio.portfolio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.portfolio.R;

import java.util.ArrayList;
import java.util.List;


public class PortfolioFragment extends Fragment {

    List<PortfolioItem>mdata;
    RecyclerView rv_Portfolio;
    PortfolioAdapter portfolioAdapter;

    public PortfolioFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portfolio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv_Portfolio=view.findViewById(R.id.rv_portfolio);

        mdata = new ArrayList<>();
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());
        mdata.add(new PortfolioItem());

        PortfolioAdapter PortfolioAdapter = new PortfolioAdapter(mdata);

        rv_Portfolio.setLayoutManager(new GridLayoutManager(getActivity(),3));
        rv_Portfolio.setAdapter(portfolioAdapter);


    }
}