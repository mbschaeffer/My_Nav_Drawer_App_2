package com.kiskiarea.mynavdrawerapp2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

//import android.app.Fragment;

/**
 * Created by Melissa on 11/16/2015.
 */
public class Fragment0 extends Fragment {

    View mContentView;



    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        mContentView = inflater.inflate(R.layout.fragment0, container, false);

        ImageButton buttons[] = new ImageButton[4];

        buttons[0] = (ImageButton) mContentView.findViewById(R.id.imgBClothing);
        buttons[1] = (ImageButton) mContentView.findViewById(R.id.imgBSupplies);
        buttons[2] = (ImageButton) mContentView.findViewById(R.id.imgBSnacks);
        buttons[3] = (ImageButton) mContentView.findViewById(R.id.imgBMisc);




        for (int i=0; i < buttons.length; ++i) {
            buttons[i].setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    Globals.current_category = 0;

                    //Set the default fragment
                    Class fragmentClass = Fragment3.class; ;
                    Fragment fragment = null;

                    try {
                        fragment = (Fragment) fragmentClass.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    // Insert the fragment by replacing any existing fragment
                    // FragmentManager fragmentManager = getSupportFragmentManager();

                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();


                }
            });

        }



        //----Inflate the layout for this fragment---
        return mContentView;


    }



}