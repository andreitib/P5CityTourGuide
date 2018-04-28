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
        city.add(new City(getString(R.string.restaurant_panoramic), R.drawable.restaurant_panoramic,"Piata Unirii,Nr.5, Etaj 13,CP 700056", "0232205013"));
        city.add(new City(getString(R.string.restaurant_oscar), R.drawable.restaurant_oscar,"Strada Lascar Catargi,Nr. 16,CP 700107", "0745245251"));
        city.add(new City(getString(R.string.restaurant_cuib), R.drawable.restaurant_cuib,"Gavriil Musicescu,Nr. 14,CP 700127", "0743604229"));
        city.add(new City(getString(R.string.restaurant_innitalia), R.drawable.restaurant_innitalia,"Piata Unirii,Nr. 2,CP 238901", "0232273951"));
        city.add(new City(getString(R.string.restaurant_laconac), R.drawable.restaurant_laconac,"Strada Gane Nicolae,Nr. 27,CP 700110", "0746279893"));
        city.add(new City(getString(R.string.restaurant_mamma_mia), R.drawable.restaurant_mamma_mia,"Bulevard Stefan cel Mare si Sfant,Nr 17, CP 700124", "0762662642"));


        CategoryAdapter adapter = new CategoryAdapter(getActivity(), city);

        GridView gridView = rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);

        return rootView;
    }

}
