package com.jackreports.rooms_list_fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.jackreports.MainActivity;
import com.jackreports.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brodjag on 09.05.16.
 */
public class MarksListSet  {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    MainActivity con;


   public MarksListSet(MainActivity activity){
       con=activity;

       mRecyclerView = (RecyclerView) con.findViewById(R.id.marcs_recycler_view);
       //mRecyclerView.setHasFixedSize(true);
       mLayoutManager = new LinearLayoutManager(con);
       mRecyclerView.setLayoutManager(mLayoutManager);

       //create sample data for room list
       List<Mark> myDataset=new ArrayList<>();
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       myDataset.add(new Mark(1,"Roadside Inspection Site"));
       mAdapter = new MarksListAdapter(myDataset,con);
       mRecyclerView.setAdapter(mAdapter);
   }



}

