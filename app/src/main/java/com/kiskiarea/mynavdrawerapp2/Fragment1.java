package com.kiskiarea.mynavdrawerapp2;

import android.support.v4.app.Fragment;
//import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Melissa on 11/16/2015.
 */
public class Fragment1 extends Fragment {
    //@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        //----Inflate the layout for this fragment---
        return inflater.inflate(R.layout.fragment1, container, false);
    }
}