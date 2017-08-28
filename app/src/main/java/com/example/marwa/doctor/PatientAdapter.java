package com.example.marwa.doctor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Marwa on 8/28/2017.
 */

public class PatientAdapter  extends ArrayAdapter<User> {
    Context context ;
    public PatientAdapter(Context context, ArrayList<User> items) {
        super(context, 0, items);
        this.context = context ;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_list,parent, false);

            TextView email = (TextView) convertView.findViewById(R.id.email);
            TextView pass = (TextView) convertView.findViewById(R.id.pass);


            User user = getItem(position);
            email.setText(user.getUserEmail());
            pass.setText(user.getUserPass());
        }else {

            TextView email = (TextView) convertView.findViewById(R.id.email);
            TextView pass = (TextView) convertView.findViewById(R.id.pass);


            User user = getItem(position);
            email.setText(user.getUserEmail());
            pass.setText(user.getUserPass());

        }

        return convertView;
    }
}



