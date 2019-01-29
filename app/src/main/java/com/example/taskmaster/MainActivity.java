package com.example.taskmaster;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

import com.example.taskmaster.Models.Project;
import com.example.taskmaster.database.ProjectDatabase;

import java.util.List;

public class MainActivity extends AppCompatActivity {

  //This project was created with the resources provided by Michelle Ferreirae's code review on Daniel Logerstedt original work

  private RecyclerView projectList;
  private RecyclerView.Adapter projectAdapter;
  private RecyclerView.LayoutManager projectLayoutManager;
  private List<Project> projects;
  ProjectDatabase db;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
//    db = Room.databaseBuilder(getApplicationContext(), ProjectDatabase.class, "projects").allowMainThreadQueries().build();
//    build  List<Project> projects = db.daoAccess().fetchProjects();
  }

  public void onNewProjectClick(View view){
      Intent createProjects = new Intent(this, CreateProjectActivity.class);
      startActivity(createProjects);
  }
}
