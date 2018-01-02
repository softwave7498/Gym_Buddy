package com.example.monty.myui;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Monty on 30-12-2017.
 */

public class myownadapter extends RecyclerView.Adapter {
    FragmentActivity ctx;
    String s1[],s2;
    int img[];
    public myownadapter(FragmentActivity ct,int i[],String data[],String s)
    {
        ctx = ct;
        img = i;
        s1= data;
        s2=s;
    }

    private class myownholder extends RecyclerView.ViewHolder
    {
        TextView t1,t2;
        ImageView i1;

        public myownholder(View itemView)
        {
            super(itemView);
            t1 = (TextView)itemView.findViewById(R.id.exe_name);
            t2 = (TextView)itemView.findViewById(R.id.exe_sets);
            i1 = (ImageView)itemView.findViewById(R.id.image_exe);
        }
    }

    @Override
    public myownholder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View myownview = inflater.inflate(R.layout.exercise,parent,false);
        return new myownholder(myownview);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position)
    {
        myownholder mh = (myownholder)holder;
        mh.t1.setText(s1[position].toString());
        mh.t2.setText(s2.toString());
        mh.i1.setImageResource(img[position]);
    }

    @Override
    public int getItemCount()
    {
        return img.length;
    }
}
