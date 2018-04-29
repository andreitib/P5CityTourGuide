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
public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.iasicitytour_grid, container, false);
        // Create a list of words
        ArrayList<City> city = new ArrayList<>();
        city.add(new City(getString(R.string.hotel_international), R.drawable.hotel_international,getString(R.string.adress_hotel_international), getString(R.string.phone_hotel_international)));
        city.add(new City(getString(R.string.hotel_pleiada), R.drawable.hotel_pleiada,getString(R.string.adress_hotel_pleiada), getString(R.string.phone_hotel_pleiada)));
        city.add(new City(getString(R.string.hotel_bellaria), R.drawable.hotel_bellaria,getString(R.string.adress_hotel_bellaria), getString(R.string.phone_hotel_bellaria)));
        city.add(new City(getString(R.string.hotel_il_primo), R.drawable.hotel_il_primo,getString(R.string.adress_hotel_il_primo), getString(R.string.phone_hotel_il_primo)));
        city.add(new City(getString(R.string.hotel_belleville), R.drawable.hotel_belleville,getString(R.string.adress_hotel_belleville), getString(R.string.phone_hotel_belleville)));
        city.add(new City(getString(R.string.hotel_hampton_by_hilton), R.drawable.hotel_hampton_by_hilton_iasi,getString(R.string.adress_hotel_hampton_by_hilton_iasi),getString(R.string.phone_hotel_hampton_by_hilton_iasi)));
        city.add(new City(getString(R.string.hotel_ildis), R.drawable.hotel_ildis,getString(R.string.adress_hotel_ildis), getString(R.string.phone_hotel_ildis)));
        city.add(new City(getString(R.string.unirea_hotel_spa), R.drawable.hotel_unirea_hotel_spa,getString(R.string.adress_hotel_unirea_hotel_spa), getString(R.string.phone_hotel_unirea_hotel_spa)));

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
