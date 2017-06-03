package com.arms.fragmentapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by 52-511-01 on 3/2/2560.
 */

public class ProjectsFragment extends ListFragment {

    public static final String POSITION = "com.arms.fragmentapp.POSITION";
    public ProjectsFragment(){

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                Project.Projects
        ));
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Intent intent = new Intent(getActivity(),SubActivity.class);
        intent.putExtra(POSITION,position);
        startActivity(intent);
    }
}
