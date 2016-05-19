package com.jackreports.rooms_list_fragment;

import android.app.Activity;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.jackreports.R;

import java.util.List;

/**
 * Implementation of Adapter for recicklerView of RoomList
 */
public class MarksListAdapter extends RecyclerView.Adapter<MarksListAdapter.ViewHolder> {
    private List<Mark> mDataset;
    Activity con;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView icon;
        public TextView title;
        public View itemView;


        public ViewHolder(View v) {
            super(v);
            itemView=v;
            icon =(ImageView) v.findViewById(R.id.icon);
            title =(TextView) v.findViewById(R.id.title);

        }
    }

    public MarksListAdapter(List<Mark> myDataset, Activity con) {
        mDataset = myDataset;
        this.con=con;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mark, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {

        final Mark myMarks =mDataset.get(position);
        holder.title.setText(myMarks.title);
        //holder.title.setTextColor(con.getResources().getColor(R.color.textMain));

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(con,"id= '#"+ myMarks.id+"'",Toast.LENGTH_LONG).show();
                //todo item click listener
            }
        });



    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

