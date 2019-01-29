package com.example.taskmaster;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.taskmaster.Models.Project;

public class CreateProjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);
    }

    public void onCreateProjectButtonPressed(View v){
        //select the elements
        TextView titleView = findViewById(R.id.projectNameField);
        TextView descriptionView = findViewById(R.id.descriptionField);

        //get their text
        String projectName = titleView.getText().toString();
        String projectDescription = descriptionView.getText().toString();

        //construct the project
        Project newProject = new Project(projectName, projectDescription);

        //get the database

    }
}
