package com.arms.fragmentapp;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 52-511-01 on 3/2/2560.
 */

public class TasksFragment extends Fragment {
    public TasksFragment(){}

    public static TasksFragment fragInsance (int position){
        TasksFragment tasksFragment = new TasksFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("position",position);
        tasksFragment.setArguments(bundle);
        return tasksFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        View taskDetail = inflater.inflate(R.layout.task_detail,container,false);
        ((TextView)taskDetail.findViewById(R.id.TaskText)).setText(Project.Tasks[getArguments().getInt("position")]);
        return taskDetail;
    }
}
