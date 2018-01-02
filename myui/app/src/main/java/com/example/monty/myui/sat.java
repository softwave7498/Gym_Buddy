package com.example.monty.myui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class sat extends Fragment {

    RecyclerView rec;
    myownadapter md;
    int image_rec[] = {R.drawable.latpulldown,R.drawable.seated_cable_row,R.drawable.close_grip_front_lat_pulldown,R.drawable.chin_ups,R.drawable.close_grip_bench_press,R.drawable.narrow_grip_push_up, R.drawable.barbell_sqates, R.drawable.front_barbell_squat,R.drawable.calves_leg_press,R.drawable.sumo_squat,R.drawable.squats,R.drawable.crunch};
    String name[] ={"Lat Pull Downs","Seated Cable rows","Close Grip Front Lat Pull Downs","Chin Ups","Close grip Bench Press","Narrow Grip Push Ups","Barell Squats", "Front Barell Squats","calves leg Press","Sumo Squat","squats","Crunches"};

    String sets= "3 sets of 20 Repetations";


    public sat() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        md = new myownadapter(getActivity(),image_rec,name,sets);
        View view = inflater.inflate(R.layout.fragment_sat, container, false);
        rec = (RecyclerView)view.findViewById(R.id.re_view_sat);
        rec.setAdapter(md);
        rec.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;
    }

}
