package com.example.taskmaster;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import com.example.taskmaster.Models.Project;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //This code block was provided by Michelle Ferreirae's code review on Daniel Logerstedt original work
    private RecyclerView prjectList;
    private RecyclerView.Adapter projectAdapter;
    private RecyclerView.LayoutManager projectLayoutManager;
    private List<Project> projects;
    ProjectDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = Room.databaseBuilder(getApplicationContext(), ProjectDatabase.class, "projects").allowMainThreadQueries().build();

        List<Project> projects = db.daoAccess().fetchProjects();

    }

}
