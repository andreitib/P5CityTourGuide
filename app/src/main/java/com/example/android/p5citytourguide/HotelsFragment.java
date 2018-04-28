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
        city.add(new City(getString(R.string.hotel_international), R.drawable.hotel_international,"Strada Palat,Nr. 5A,CP 700032", "0332110060"));
        city.add(new City(getString(R.string.hotel_pleiada), R.drawable.hotel_pleiada,"Sos. Bucium,Nr. 18 B,CP 700282", "0332425425"));
        city.add(new City(getString(R.string.hotel_bellaria), R.drawable.hotel_bellaria,"Soseaua Bucium,Nr. 7,CP 700280", "0332233870"));
        city.add(new City(getString(R.string.hotel_il_primo), R.drawable.hotel_il_primo,"Strada Fericirii,Nr. 10,CP 707027", "0723206865"));
        city.add(new City(getString(R.string.hotel_belleville), R.drawable.hotel_belleville,"Strada Ciurchi,Nr. 21,CP 700313", "0743222242"));
        city.add(new City(getString(R.string.hotel_hampton_by_hilton), R.drawable.hotel_hampton_by_hilton_iasi,"St. Anastasie Panu,Nr.23,CP 2699999","0232242000"));
        city.add(new City(getString(R.string.hotel_ildis), R.drawable.hotel_ildis,"Strada Muntenimii,Nr. 7,CP 99999", "0232447777"));
        city.add(new City(getString(R.string.unirea_hotel_spa), R.drawable.hotel_unirea_hotel_spa,"Piata Unirii,Nr. 5,CP 700056", "0232205000"));

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
