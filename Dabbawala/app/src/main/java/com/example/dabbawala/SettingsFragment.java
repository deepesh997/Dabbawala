package com.example.dabbawala;

import static com.example.dabbawala.R.id.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import javax.net.ssl.SSLEngineResult;

public class SettingsFragment extends Fragment {
    public SettingsFragment()
    {

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container,false);

        String[] menuItems = {"Menu items",
                                "Help Center",
                                   "Privacy Policy",
                                      "About us",
                                        "Exit"};

        ListView listView = (ListView)view.findViewById(mainMenu);

        ArrayAdapter<String> listViewadapter = new ArrayAdapter<String>(
          getActivity(),
          R.layout.text_color_layout,
          menuItems
        );
        listView.setAdapter(listViewadapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if (position == 0) {
                    startActivity(new Intent(getActivity(),Activity_menu.class));

                }
                else if (position == 1) {
                    startActivity(new Intent(getActivity(),HelpActivity.class));

                }
                else if (position == 2) {
                    startActivity(new Intent(getActivity(),PrivacyPolicy.class));
                }
                else{
                    startActivity(new Intent(getActivity(), MainActivity.class));
                }

            }

        });

        return view;
    }
}
