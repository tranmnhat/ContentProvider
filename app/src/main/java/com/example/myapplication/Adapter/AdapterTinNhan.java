package com.example.myapplication.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.myapplication.Model.TinNhan;
import com.example.myapplication.R;

import java.util.List;

public class AdapterTinNhan extends ArrayAdapter<TinNhan> {
    Activity context;
    int resource;
    @NonNull List<TinNhan> objects;
    public AdapterTinNhan(@NonNull Activity context, int resource, @NonNull List<TinNhan> objects) {
        super(context, resource, objects);

        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        View row = layoutInflater.inflate(this.resource, null);

        TextView number1 = row.findViewById(R.id.txt_phone);
        TextView time1 = row.findViewById(R.id.txt_time);
        TextView body1 = row.findViewById(R.id.txt_body);

        number1.setText(this.objects.get(position).getNumber());
        time1.setText(this.objects.get(position).getTime());
        body1.setText(this.objects.get(position).getBody());
        return row;
    }
}
