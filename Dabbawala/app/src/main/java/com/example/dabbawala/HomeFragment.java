package com.example.dabbawala;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    public HomeFragment(){

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container,false);

        /*SearchView searchView;
        ListView listView;
        ArrayList<String> list = new ArrayList<>();


        searchView = (SearchView) view.findViewById(R.id.searchView);
        listView =(ListView) view.findViewById(R.id.myList);


        list.add("bada bazaar");
        list.add("Gopalganj");
        list.add("Tilli");
        list.add("Sadar");
        list.add("Cant");
        list.add("Dharma Shree");

        ArrayAdapter<String> listViewadapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.text_color_layout,
                list
        );
        listView.setAdapter(listViewadapter);


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                listViewadapter.getFilter().filter(s);
                return false;
            }
        });*/


        return view;
    }
}
