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
        city.add(new City(getString(R.string.muzeul_universitatii), R.drawable.muzeul_universitatii,"Strada Maiorescu Titu,Nr. 12,CP 700460", "0232/201102/2451"));
        city.add(new City(getString(R.string.muzeul_casa_dosoftei), R.drawable.muzeul_casa_dosoftei,"Strada Panu Anastasie,Nr. 54,CP 700019", "0232261070"));
        city.add(new City(getString(R.string.muzeul_bojdeuca_creanga), R.drawable.muzeul_bojdeuca_creanga,"Strada Simion Burnuiu,Nr. 4,CP 700118", "0747499488"));
        city.add(new City(getString(R.string.muzeul_union), R.drawable.muzeul_union,"Strada Alexandru Lapusneanu,Nr. 14,CP 700057", "0232340763"));
        city.add(new City(getString(R.string.muzeul_municipal), R.drawable.muzeul_municipal,"Strada, Zmeu,Nr. 3,CP 700400", "02324839234"));
        city.add(new City(getString(R.string.muzeul_mihail_sadoveanu), R.drawable.muzeul_mihail_sadoveanu,"Aleea Sadoveanu Mihail,Nr. 12,CP 700489", "0747499408"));
        city.add(new City(getString(R.string.muzeul_metropolitan), R.drawable.muzeul_metropolitan,"Bd. Stefan cel Mare si Sfant,Nr.18,CP 700064", "0232479298"));

        CategoryAdapter adapter = new CategoryAdapter(getActivity(), city);

        GridView gridView = rootView.findViewById(R.id.grid);
        gridView.setAdapter(adapter);

        return rootView;
    }

}
