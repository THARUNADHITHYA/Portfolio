package com.example.portfolio.sidemenu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.portfolio.R;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuAdapterViewHolder> {

    List<MenuItem>mdata;
    Callback listener;

    public MenuAdapter(List<MenuItem> mdata,Callback listener) {
        this.mdata = mdata;
        this.listener=listener;
    }

    @NonNull
    @Override
    public MenuAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu,parent,false);
        return new MenuAdapterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuAdapterViewHolder holder, int position) {

        holder.icon.setImageResource(mdata.get(position).getIcon());
        if(mdata.get(position).isSelected())
        {
            holder.isSelected.setVisibility(View.VISIBLE);
        }
        else
            holder.isSelected.setVisibility(View.GONE);
    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class MenuAdapterViewHolder extends RecyclerView.ViewHolder{

        ImageView icon,isSelected;


        public MenuAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            icon=itemView.findViewById(R.id.item_menu_icon);
            isSelected=itemView.findViewById(R.id.item_menu_selected);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onSideMenuItemClick(getAdapterPosition());
                }
            });

        }
    }
}
