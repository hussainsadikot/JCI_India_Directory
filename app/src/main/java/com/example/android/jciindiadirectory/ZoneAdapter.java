package com.example.android.jciindiadirectory;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ZoneAdapter extends ArrayAdapter<ZoneList> {
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View zonelistview = convertView;
        if (zonelistview == null) {
            zonelistview = LayoutInflater.from(getContext()).inflate(
                    R.layout.zone_list_view, parent, false);
        }
        // Get the {@link AndroidFlavor} object located at this position in the list
        ZoneList currentListItem = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView ZoneTextView = (TextView) zonelistview.findViewById(R.id.zone_text_view);
        ZoneTextView.setText(currentListItem.getmZone());
        return zonelistview;

    }

    public ZoneAdapter(Activity context, ArrayList<ZoneList> zoneLists ) {
        super(context, 0, zoneLists);


    }
}
