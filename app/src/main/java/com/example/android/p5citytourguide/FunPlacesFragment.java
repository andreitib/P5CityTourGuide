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
        city.add(new City(getString(R.string.club_coopers_lounge), R.drawable.club_coopers_lounge,"Strada Tudor Vladimirescu,Nr. 56,CP 700259", "0758104822"));
        city.add(new City(getString(R.string.club_fratelli), R.drawable.club_fratelli,"Strada Tudor Vladimirescu,Nr. 2,CP 700259", "0758104822"));
        city.add(new City(getString(R.string.club_skin), R.drawable.club_skin,"Strada Constantin Mille,Nr. 4,CP 030167", "0748130500"));
        city.add(new City(getString(R.string.club_babylon), R.drawable.club_babylon,"Str Anastasie Panu,Nr. 1,CP 700020", "0751606843"));
        city.add(new City(getString(R.string.club_master), R.drawable.club_master,"Strada Țepeș Vodă,Nr. 1,CP 700259", "0724783123"));
        city.add(new City(getString(R.string.room_master_escape_), R.drawable.club_master,"Bulevardul Socola,Nr. 22,CP 700187", "0740505753"));
        city.add(new City(getString(R.string.zero_gravity_climbing), R.drawable.zero_gravity_climbing,"Strada Plopii fara Sot,Nr. 28,CP 700273", "0734011115"));
        city.add(new City(getString(R.string.escape_room_madscape), R.drawable.room_madscape,"Soseaua Nationala,Nr. 180A,,CP 218994", "0799459859"));

        CategoryAdapter adapter = new CategoryAdapter(getActivity(), city);

        GridView gridView = rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);

        return rootView;
    }

}
