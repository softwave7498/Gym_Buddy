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
    int image_rec[] = {R.drawable.chin_ups,R.drawable.dumbell_curls,R.drawable.preachers_curls,R.drawable.cable_curls,R.drawable.concentration_curls,R.drawable.triceps_extention_curls,R.drawable.triceps_extention_cable,R.drawable.close_grip_bench_press,R.drawable.narrow_grip_push_up};
    String name[] ={"Chin Ups","Dumbell Curls","Preacher Curls","Cable curls","Concentration Curls","Triceps Extention Curls","cable Triceps Extention","Close grip Bench Press","Narrow Grip Push Ups"};

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
