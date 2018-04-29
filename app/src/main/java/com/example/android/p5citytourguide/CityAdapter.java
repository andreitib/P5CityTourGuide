package com.example.android.p5citytourguide;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Provides the appropriate {@link Fragment} for a view pager.
 */
class CityAdapter  extends ArrayAdapter<City> {

    public CityAdapter(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        // Get the {@link City} object located at this position in the list
        City currentCity = getItem(position);

        // Find the ImageView in the grid_item.xml layout with the ID image.
        ImageView imageView = listItemView.findViewById(R.id.image);
        // Get the image from the currentCity object and display the provided image
        // based on the resource ID
        assert currentCity != null;
        imageView.setImageResource(currentCity.getImageId());

        // Find the TextView in the grid_item.xml layout with the ID name.
        TextView nameCityIasi = listItemView.findViewById(R.id.name);
        // Get the name from the currentCity object and set this text on
        // the name TextView.
        nameCityIasi.setText(currentCity.getName());

        // Find the TextView in the grid_item.xml layout with the ID address.
        TextView addressCityIasi = listItemView.findViewById(R.id.address);
        // Get the address from the currentCity object and set this text on
        // the address TextView.
        addressCityIasi.setText(currentCity.getAddress());

        // Find the TextView in the grid_item.xml layout with the ID phone.
        TextView phoneCityIasi = listItemView.findViewById(R.id.phone);
        // Get the phone from the currentCity object and set this text on
        // the phone TextView.
        phoneCityIasi.setText(currentCity.getPhone());

        // Return the whole list item layout (containing 2 TextViews and one Image view)
        // so that it can be shown in the ListView.
        return listItemView;
    }
}
