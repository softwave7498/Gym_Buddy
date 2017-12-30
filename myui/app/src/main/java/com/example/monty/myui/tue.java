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
public class tue extends Fragment {

    myownadapter md;
    RecyclerView rec;
    int image_rec[] = {R.drawable.militry_press,R.drawable.dumbell_press,R.drawable.seated_militry_press,R.drawable.dumbell_lateral_raises, R.drawable.cable_front_raises, R.drawable.up_right_rows, R.drawable.barbell_sqates, R.drawable.front_barbell_squat,R.drawable.calves_leg_press,R.drawable.sumo_squat,R.drawable.squats};
    String name[] ={"Militry Press","Dumbell Press","Seated Militry Press","Dumbell Lateral Raises","Cable Front Raises","Up Right Rows","Barell Squats", "Front Barell Squats","calves leg Press","Sumo Squat","squats"};
    String sets= "3 sets of 20 Repetations";


    public tue() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        md = new myownadapter(getActivity(),image_rec,name,sets);
        View view = inflater.inflate(R.layout.fragment_tue, container, false);
        rec = (RecyclerView)view.findViewById(R.id.re_view_tue);
        rec.setAdapter(md);
        rec.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;

    }

}
