package com.example.listview2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

    public class MyArrayAdapter extends ArrayAdapter {
        List<Oblist> arr;

        public MyArrayAdapter(@NonNull Context context, int resource, List<Oblist> arr) {
            super(context, resource, arr);
            this.arr = arr;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.chatview,parent,false);
            ImageView i1 = convertView.findViewById(R.id.dp);
            TextView t1 = convertView.findViewById(R.id.usna);
            TextView t2 = convertView.findViewById(R.id.time);
            TextView t3 = convertView.findViewById(R.id.msg);
            i1.setImageResource(arr.get(position).dp);
            t1.setText(arr.get(position).uname);
            t2.setText(arr.get(position).time);
            t3.setText(arr.get(position).msg);
            return convertView;
        }

        @Nullable
        @Override
        public Object getItem(int position) {
            return arr.get(position);
        }
    }

