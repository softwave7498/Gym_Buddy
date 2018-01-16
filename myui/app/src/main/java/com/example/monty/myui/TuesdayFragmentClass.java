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
public class TuesdayFragmentClass extends Fragment {

    myownadapter md;
    RecyclerView rec;
    int image_rec[] = {R.drawable.dumbell_curls,R.drawable.preachers_curls,R.drawable.cable_curls,R.drawable.concentration_curls,R.drawable.triceps_extention_curls,R.drawable.triceps_extention_cable,R.drawable.militry_press,R.drawable.dumbell_press,R.drawable.seated_militry_press,R.drawable.dumbell_lateral_raises, R.drawable.cable_front_raises, R.drawable.up_right_rows,R.drawable.crunch};
    String name[];
    String sets= "3 sets of 20 Repetations";


    public TuesdayFragmentClass() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        name=getResources().getStringArray(R.array.exercise_name_tue_fri);
        md = new myownadapter(getActivity(),image_rec,name,sets);
        View view = inflater.inflate(R.layout.fragment_tue, container, false);
        rec = (RecyclerView)view.findViewById(R.id.re_view_tue);
        rec.setAdapter(md);
        rec.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;

    }

}
