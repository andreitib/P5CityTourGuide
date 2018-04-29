package com.example.android.p5citytourguide;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.iasicitytour_grid, container, false);
        // Create a list of words
        ArrayList<City> city = new ArrayList<>();
        city.add(new City(getString(R.string.restaurant_panoramic), R.drawable.restaurant_panoramic,getString(R.string.adress_restaurant_panoramic), getString(R.string.phone_restaurant_panoramic)));
        city.add(new City(getString(R.string.restaurant_oscar), R.drawable.restaurant_oscar,getString(R.string.adress_restaurant_oscar), getString(R.string.phone_restaurant_oscar)));
        city.add(new City(getString(R.string.restaurant_cuib), R.drawable.restaurant_cuib,getString(R.string.adress_restaurant_cuib), getString(R.string.phone_restaurant_cuib)));
        city.add(new City(getString(R.string.restaurant_innitalia), R.drawable.restaurant_innitalia,getString(R.string.adress_restaurant_innitalia), getString(R.string.phone_restaurant_innitalia)));
        city.add(new City(getString(R.string.restaurant_laconac), R.drawable.restaurant_laconac,getString(R.string.adress_restaurant_laconac), getString(R.string.phone_restaurant_laconac)));
        city.add(new City(getString(R.string.restaurant_mamma_mia), R.drawable.restaurant_mamma_mia,getString(R.string.adress_restaurant_mamma_mia), getString(R.string.phone_restaurant_mamma_mia)));

        // Create an {@link CityAdapter}, whose data source is a list of {@link Citie}s. The
        // adapter knows how to create list grid items for each item in the list.
        CityAdapter adapter = new CityAdapter(getActivity(), city);
        // Find the {@link GridView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link GridView} with the view ID called list, which is declared in the
        // iasicitytour_grid.xml layout file.
        GridView gridView = rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);

        return rootView;
    }

}
