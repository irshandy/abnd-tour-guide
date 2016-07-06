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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.name_sariater), getString(R.string.address_sariater), R.drawable.img_sariater));
        places.add(new Place(getString(R.string.name_tahura), getString(R.string.address_tahura), R.drawable.img_tahura));
        places.add(new Place(getString(R.string.name_situ_patenggang), getString(R.string.address_situ_patenggang), R.drawable.img_situpatenggang));
        places.add(new Place(getString(R.string.name_curug_cimahi), getString(R.string.address_curug_cimahi), R.drawable.img_curugcimahi));
        places.add(new Place(getString(R.string.name_teras_cikapundung), getString(R.string.address_teras_cikapundung), R.drawable.img_terascikapundung));
        places.add(new Place(getString(R.string.name_taman_lansia), getString(R.string.address_taman_lansia), R.drawable.img_tamanlansia));
        places.add(new Place(getString(R.string.name_taman_centrum), getString(R.string.address_taman_centrum), R.drawable.img_tamanmusik));
        places.add(new Place(getString(R.string.name_malabar), getString(R.string.address_malabar), R.drawable.img_kebunteh));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
