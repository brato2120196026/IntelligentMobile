package com.example.patientinformationapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<UserModel> userModelArrayList;

    public CustomAdapter(Context context, ArrayList<UserModel> userModelArrayList) {

        this.context = context;
        this.userModelArrayList = userModelArrayList;
    }

    @Override
    public int getCount() {
        return userModelArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return userModelArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint({"SetTextI18n", "InflateParams"})
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.lv_item, null, true);

            holder.tvname = convertView.findViewById(R.id.name);
            holder.tvaddress = convertView.findViewById(R.id.address);
            holder.tvage = convertView.findViewById(R.id.age);
            holder.tvsex = convertView.findViewById(R.id.sex);
            holder.tvcontact = convertView.findViewById(R.id.contact);
            holder.tvcity = convertView.findViewById(R.id.city);


            convertView.setTag(holder);
        }else {
            // the getTag returns the viewHolder object set as a tag to the view
            holder = (ViewHolder)convertView.getTag();
        }

        holder.tvname.setText("Name: "+userModelArrayList.get(position).getName());
        holder.tvaddress.setText("Address: "+userModelArrayList.get(position).getAddress());
        holder.tvage.setText("Age: "+userModelArrayList.get(position).getAge());
        holder.tvsex.setText("Sex: "+userModelArrayList.get(position).getSex());
        holder.tvcontact.setText("Contact: "+userModelArrayList.get(position).getContact());
        holder.tvcity.setText("City: "+userModelArrayList.get(position).getCity());

        return convertView;
    }

    private class ViewHolder {
        protected TextView tvname, tvaddress, tvage, tvsex, tvcontact, tvcity;

    }
}
