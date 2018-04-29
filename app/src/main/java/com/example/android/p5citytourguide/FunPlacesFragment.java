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
public class FunPlacesFragment extends Fragment {


    public FunPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.iasicitytour_grid, container, false);
        // Create a list of words
        ArrayList<City> city = new ArrayList<>();
        city.add(new City(getString(R.string.club_coopers_lounge), R.drawable.club_coopers_lounge,getString(R.string.adress_club_coopers_lounge), getString(R.string.phone_club_coopers_lounge)));
        city.add(new City(getString(R.string.club_fratelli), R.drawable.club_fratelli,getString(R.string.adress_club_fratelli), getString(R.string.phone_club_fratelli)));
        city.add(new City(getString(R.string.club_skin), R.drawable.club_skin,getString(R.string.adress_club_skin), getString(R.string.phone_club_skin)));
        city.add(new City(getString(R.string.club_babylon), R.drawable.club_babylon,getString(R.string.adress_club_babylon), getString(R.string.phone_club_babylon)));
        city.add(new City(getString(R.string.club_master), R.drawable.club_master,getString(R.string.adress_club_master), getString(R.string.phone_club_master)));
        city.add(new City(getString(R.string.room_master_escape_), R.drawable.room_master_escape,getString(R.string.adress_room_master_escape), getString(R.string.phone_room_master_escape)));
        city.add(new City(getString(R.string.zero_gravity_climbing), R.drawable.zero_gravity_climbing,getString(R.string.adress_zero_gravity_climbing), getString(R.string.phone_zero_gravity_climbing)));
        city.add(new City(getString(R.string.escape_room_madscape), R.drawable.room_madscape,getString(R.string.adress_room_madscape), getString(R.string.phone_room_madscape)));
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
