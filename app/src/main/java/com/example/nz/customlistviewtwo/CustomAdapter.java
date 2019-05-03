package com.example.nz.customlistviewtwo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Nz on 2/18/2019.
 */

public class CustomAdapter extends BaseAdapter {

    LayoutInflater layoutInflater;
    Context context;
    int [] flags;
    String [] countryName;

    CustomAdapter (Context context, String [] countryName, int [] flags){

        this.context = context;
        this.flags = flags;
        this.countryName = countryName;
    }





    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
         if(convertView == null){

            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.custom_layout,parent,false);
         }

        ImageView imageView = (ImageView) convertView.findViewById(R.id.imageView);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        imageView.setImageResource(flags[position]);
        textView.setText(countryName[position]);

        return convertView;
    }
}
