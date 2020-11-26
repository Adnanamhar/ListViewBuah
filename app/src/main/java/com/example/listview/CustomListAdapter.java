package com.example.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListAdapter extends ArrayAdapter<String>{
    private final Activity context;
    private final String[] judulList;
    private final Integer[] gambarList;

    public CustomListAdapter(Activity context, String[] judulList, Integer[] gambarList) {
        super(context, R.layout.list_row, judulList);
        this.context = context;
        this.judulList = judulList;
        this.gambarList = gambarList;

    }
    public View getView (int position, View view, ViewGroup viewGroup){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.list_row,null,true);

        TextView txtList = (TextView)rowView.findViewById(R.id.txt_list);
        ImageView imageList = (ImageView) rowView.findViewById(R.id.image_list);

        txtList.setText(judulList[position]);
        imageList.setImageResource(gambarList[position]);
        
        return rowView;

    }
}
