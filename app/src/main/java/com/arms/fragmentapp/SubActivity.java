package com.arms.fragmentapp;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 52-511-01 on 3/2/2560.
 */

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        int position = getIntent().getIntExtra(ProjectsFragment.POSITION,0);
        TasksFragment tasksFragment = TasksFragment.fragInsance(position);
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.taskFram,tasksFragment)
                .commit();
    }
}
