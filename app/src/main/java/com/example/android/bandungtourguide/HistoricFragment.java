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
public class HistoricFragment extends Fragment {


    public HistoricFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.name_museum_kaa), getString(R.string.address_museum_kaa), getString(R.string.tel_museum_kaa)));
        places.add(new Place(getString(R.string.name_stpeter_cathedral), getString(R.string.address_stpeter_cathedral)));
        places.add(new Place(getString(R.string.name_gedung_bi), getString(R.string.address_gedung_bi)));
        places.add(new Place(getString(R.string.name_gedung_sate), getString(R.string.address_gedung_sate)));
        places.add(new Place(getString(R.string.name_masjid_agung), getString(R.string.address_masjid_agung)));
        places.add(new Place(getString(R.string.name_masjid_salman), getString(R.string.address_masjid_salman)));
        places.add(new Place(getString(R.string.name_itb), getString(R.string.address_itb), getString(R.string.tel_itb)));
        places.add(new Place(getString(R.string.name_savoy_homann), getString(R.string.address_savoy_homann), getString(R.string.tel_savoy_homann)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }

}
