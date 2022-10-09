package com.example.infomovie.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.infomovie.ListAdapter;
import com.example.infomovie.R;
import com.example.infomovie.model.ListElement;

import java.util.ArrayList;
import java.util.List;


public class PopularMovie extends Fragment {

    List<ListElement> element;
    RecyclerView recyclerView;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public PopularMovie() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static PopularMovie newInstance(String param1, String param2) {
        PopularMovie fragment = new PopularMovie();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(
                R.layout.popular_movie_list, container, false);
        element = new ArrayList<>();

        recyclerView = rootView.findViewById(R.id.popular_list);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        init();
        ListAdapter adapter = new ListAdapter(element, getContext());
        recyclerView.setAdapter(adapter);
        return rootView;


    }

    private void init() {
        element = new ArrayList<>();
        element.add(new ListElement("Batman", 10, "2022-07-27", "https://loremflickr.com/320/240"));
        element.add(new ListElement("Batman", 10, "2022-07-27", "https://loremflickr.com/320/240"));
        element.add(new ListElement("Batman", 10, "2022-07-27", "https://loremflickr.com/320/240"));
        element.add(new ListElement("Batman", 10, "2022-07-27", "https://loremflickr.com/320/240"));
        element.add(new ListElement("Batman", 10, "2022-07-27", "https://loremflickr.com/320/240"));
    }
}
