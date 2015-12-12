package com.kiskiarea.mynavdrawerapp2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;


/**
 * Created by Melissa on 12/11/2015.
 */
public class CustomAdapter extends BaseAdapter{

    Context context;
    String [] result1;
    String [] result2;
    double [] price;
    int [] imageId;

    private static LayoutInflater inflater=null;

    public CustomAdapter(Context fragmentActivity, String[] itmNameList, String[] itmDescList, double[] itmPrice, int[] itmImages) {
        // TODO Auto-generated constructor stub
        result1=itmNameList;
        result2=itmDescList;
        price = itmPrice;
        context=fragmentActivity;
        imageId=itmImages;
        inflater = ( LayoutInflater )context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return result1.length;
    }

    @Override
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

    public class Holder
    {
        TextView tv1;
        TextView tv2;
        TextView tv3;
        ImageView img;
    }
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        Holder holder=new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.store_list_layout, null);
        holder.tv1=(TextView) rowView.findViewById(R.id.txtViewItemName);
        holder.tv2=(TextView) rowView.findViewById(R.id.txtViewItemDesc);
        holder.tv3=(TextView) rowView.findViewById(R.id.txtViewPrice);
        holder.img=(ImageView) rowView.findViewById(R.id.imgStudentStorePict);
        holder.tv1.setText(result1[position]);
        holder.tv2.setText(result2[position]);
        DecimalFormat formatter = new DecimalFormat("$#,##0.00");
        holder.tv3.setText(formatter.format(price[position]));
        holder.img.setImageResource(imageId[position]);
        rowView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(context, "You Clicked "+result1[position] + "  " + result2[position], Toast.LENGTH_LONG).show();
            }
        });
        return rowView;
    }

}