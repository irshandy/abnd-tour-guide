package com.example.android.bandungtourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.name_miss_bee), getString(R.string.address_miss_bee), getString(R.string.tel_miss_bee)));
        places.add(new Place(getString(R.string.name_atmosphere), getString(R.string.address_atmosphere), getString(R.string.tel_atmosphere)));
        places.add(new Place(getString(R.string.name_braga_permai), getString(R.string.address_braga_permai), getString(R.string.tel_braga_permai)));
        places.add(new Place(getString(R.string.name_hummingbird), getString(R.string.address_hummingbird), getString(R.string.tel_hummingbird)));
        places.add(new Place(getString(R.string.name_the_valley), getString(R.string.address_the_valley), getString(R.string.tel_the_valley)));
        places.add(new Place(getString(R.string.name_dapur_dahpati), getString(R.string.address_dapur_dahpati), getString(R.string.tel_dapur_dahpati)));
        places.add(new Place(getString(R.string.name_stone_cafe), getString(R.string.address_stone_cafe), getString(R.string.tel_stone_cafe)));
        places.add(new Place(getString(R.string.name_tizis), getString(R.string.address_tizis), getString(R.string.tel_tizis)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
