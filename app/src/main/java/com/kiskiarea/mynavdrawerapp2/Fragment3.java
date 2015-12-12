package com.kiskiarea.mynavdrawerapp2;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * Created by Melissa on 12/6/2015.
 */
public class Fragment3 extends Fragment {

    //Allows the use of the global variables
    Globals g;
    View mContentView;


    ListView lv;
    Context context;

    ArrayList prgmName;



    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //----Inflate the layout for this fragment---
        //return inflater.inflate(R.layout.fragment3, container, false);

        mContentView = inflater.inflate(R.layout.fragment3, container, false);

        //Access the global variables
       //Globals g = (Globals)getApplication();

       //Globals global=(Globals)getApplicationContext();

        //Get the array with the note names to load into the Spinner
        //String[] items= g.getItemsSnacks();

        String[] items;
        String[] descriptions;
        double[] prices;
        int[] pict_names;

        switch (Globals.current_category) {
            case 0:

                items = Globals.itemsClothes;
                descriptions = Globals.descriptionClothes;
                prices = Globals.priceClothes;
                pict_names = Globals.pictClothes;
                break;
            case 1:

                items = Globals.itemsSupplies;
                descriptions = Globals.descriptionSupplies;
                prices = Globals.priceSupplies;
                pict_names = Globals.pictSupplies;
                break;
            case 2:

                items = Globals.itemsSnacks;
                descriptions = Globals.descriptionSnacks;
                prices = Globals.priceSnacks;
                pict_names = Globals.pictSnacks;
                break;
            case 3:

                items = Globals.itemsMisc;
                descriptions = Globals.descriptionMisc;
                prices = Globals.priceMisc;
                pict_names = Globals.pictMisc;
                break;
            default:
                items = Globals.itemsClothes;
                descriptions = Globals.descriptionClothes;
                prices = Globals.priceClothes;
                pict_names = Globals.pictClothes;
        }




        lv=(ListView) mContentView.findViewById(R.id.listView);
        lv.setAdapter(new CustomAdapter(getActivity(), items, descriptions, prices, pict_names));







        //----Inflate the layout for this fragment---
        return mContentView;


    }




}
