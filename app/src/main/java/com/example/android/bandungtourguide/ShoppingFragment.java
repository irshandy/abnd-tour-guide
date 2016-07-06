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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.name_rumah_mode), getString(R.string.address_rumah_mode), getString(R.string.tel_rumah_mode)));
        places.add(new Place(getString(R.string.name_ciwalk), getString(R.string.address_ciwalk), getString(R.string.tel_ciwalk)));
        places.add(new Place(getString(R.string.name_paris_van_java), getString(R.string.address_paris_van_java), getString(R.string.tel_paris_van_java)));
        places.add(new Place(getString(R.string.name_the_secret_fo), getString(R.string.address_the_secret_fo)));
        places.add(new Place(getString(R.string.name_trans_studio_mall), getString(R.string.address_trans_studio_mall), getString(R.string.tel_trans_studio_mall)));
        places.add(new Place(getString(R.string.name_heritage_fo), getString(R.string.address_heritage_fo), getString(R.string.tel_heritage_fo)));
        places.add(new Place(getString(R.string.name_pasar_baru), getString(R.string.address_pasar_baru)));
        places.add(new Place(getString(R.string.name_the_summit_fo), getString(R.string.address_the_summit_fo), getString(R.string.tel_the_summit_fo)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return rootView;
    }
}
