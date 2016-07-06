package com.example.android.bandungtourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by IrvinShandy on 6/30/16.
 */
public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Place currentPlace = getItem(position);

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout, parent, false);
        }

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentPlace.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address_text_view);
        addressTextView.setText(currentPlace.getAddress());

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone_text_view);
        if (currentPlace.hasPhoneNumber()) {
            phoneTextView.setText(currentPlace.getPhoneNumber());
            phoneTextView.setVisibility(View.VISIBLE);
        } else {
            phoneTextView.setVisibility(View.GONE);
        }

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if (currentPlace.hasImage()) {
            imageView.setImageResource(currentPlace.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
