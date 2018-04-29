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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.iasicitytour_grid, container, false);
        // Create a list of words
        ArrayList<City> city = new ArrayList<>();
        city.add(new City(getString(R.string.muzeul_universitatii), R.drawable.muzeul_universitatii,getString(R.string.adress_muzeul_universitatii), getString(R.string.phone_muzeul_universitatii)));
        city.add(new City(getString(R.string.muzeul_casa_dosoftei), R.drawable.muzeul_casa_dosoftei,getString(R.string.adress_muzeul_casa_dosoftei), getString(R.string.phone_muzeul_casa_dosoftei)));
        city.add(new City(getString(R.string.muzeul_bojdeuca_creanga), R.drawable.muzeul_bojdeuca_creanga,getString(R.string.adress_muzeul_bojdeuca_creanga), getString(R.string.phone_muzeul_bojdeuca_creanga)));
        city.add(new City(getString(R.string.muzeul_union), R.drawable.muzeul_union,getString(R.string.adress_muzeul_union), getString(R.string.phone_muzeul_union)));
        city.add(new City(getString(R.string.muzeul_municipal), R.drawable.muzeul_municipal,getString(R.string.adress_muzeul_municipal), getString(R.string.phone_muzeul_municipal)));
        city.add(new City(getString(R.string.muzeul_mihail_sadoveanu), R.drawable.muzeul_mihail_sadoveanu,getString(R.string.adress_muzeul_mihail_sadoveanu), getString(R.string.phone_muzeul_mihail_sadoveanu)));
        city.add(new City(getString(R.string.muzeul_metropolitan), R.drawable.muzeul_metropolitan,getString(R.string.adress_muzeul_metropolitan), getString(R.string.phone_muzeul_metropolitan)));

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
