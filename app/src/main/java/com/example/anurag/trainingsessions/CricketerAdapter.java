package com.example.anurag.trainingsessions;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CricketerAdapter extends RecyclerView.Adapter<CricketerAdapter.ViewHandler> {
    private ArrayList<CricketModel> cricketerSet;

    @Override
    public ViewHandler onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view, parent, false);
        view.setOnClickListener(MainActivityRecyclerView.myOnClickListener);
        return new ViewHandler(view);
    }

    @Override
    public void onBindViewHolder(ViewHandler holder, int position) {
        TextView Cname = holder.Cname;
        TextView Tname = holder.Tname;
        TextView Role = holder.Role;
        ImageView imageViewIcon = holder.imageViewIcon;

        Cname.setText(cricketerSet.get(position).getCname());
        Tname.setText(cricketerSet.get(position).getTname());
        Role.setText(cricketerSet.get(position).getRole());
        imageViewIcon.setImageResource(cricketerSet.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return cricketerSet.size();
    }


    public static class ViewHandler extends RecyclerView.ViewHolder {
        private TextView Cname;
        private TextView Tname;
        private TextView Role;
        private ImageView imageViewIcon;

        public ViewHandler(View itemView) {
            super(itemView);
            this.Cname = itemView.findViewById(R.id.Cname);
            this.Tname = itemView.findViewById(R.id.team);
            this.Role = itemView.findViewById(R.id.role);
            this.imageViewIcon = itemView.findViewById(R.id.imageView);
        }
    }

    public CricketerAdapter(ArrayList<CricketModel> cricketerSet) {
        this.cricketerSet = cricketerSet;
    }
}
