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
public class thu extends Fragment {

    myownadapter md;
    RecyclerView rec;
    int image_rec[] = {R.drawable.pushup,R.drawable.pullups,R.drawable.flat_bench_press,R.drawable.inclined_dumbell_press,R.drawable.decline_doumblle_press,R.drawable.doumbell_bench_fly,R.drawable.chestdips,R.drawable.dumbell_bent_arm_pullover,R.drawable.crunch};
    String name[] ={"Push Ups","Pull Ups","Flat Bench Press","Incline Dumbell Press","Decline Press","Incline Bench Dumbell Fly","Chest Dips","Dumbell Bent Arm Pullover","Crunches"};
    String sets= "3 sets of 20 Repetations";

    public thu() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        md = new myownadapter(getActivity(),image_rec,name,sets);
        View view = inflater.inflate(R.layout.fragment_thu, container, false);
        rec = (RecyclerView)view.findViewById(R.id.re_view_thu);
        rec.setAdapter(md);
        rec.setLayoutManager(new LinearLayoutManager(getActivity()));
        return view;

    }

}
