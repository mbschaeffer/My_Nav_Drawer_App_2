package com.kiskiarea.mynavdrawerapp2;


import android.os.Bundle;
import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;


/**
 * Created by Melissa on 12/6/2015.
 */
public class Fragment3 extends Fragment {

    //Allows the use of the global variables
    Globals g;
    View mContentView;


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

        switch (Globals.current_category) {
            case 0:

                items = Globals.itemsClothes;
                break;
            case 1:

                items = Globals.itemsSupplies;
                break;
            case 2:

                items = Globals.itemsSnacks;
                break;
            case 3:

                items = Globals.itemsMisc;
                break;
            default:
                items = Globals.itemsClothes;

        }


        String str = "";

        for(int i=0; i<items.length; i++) {
            str += items[i];
        }

        //(TextView) txtRes = (TextView) ;

        TextView txtRes = (TextView) mContentView.findViewById(R.id.txtResults);

        txtRes.setText(str);




       // String[] description = g.getDescriptionSnacks();
        //String[] pict = g.getPictSnacks();
        //double[] price = g.getPriceSnacks();

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),
        //        android.R.layout.simple_list_item_1, items);
        //setListAdapter(adapter);

        //----Inflate the layout for this fragment---
        return mContentView;


    }




}
