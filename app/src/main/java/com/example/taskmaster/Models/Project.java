package com.example.taskmaster.Models;

import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Project {

    /**Instance variables*/
    @NonNull
    @PrimaryKey(autoGenerate = true)
    private long projectId;
    
    private String name;
    private String description;
    private ArrayList<Task> Tasks;

    /**Constructors*/
    public Project(){}
    public Project (String name, String description){
        this.name = name;
        this.description = description;
    }

    /**Getters*/
    public long getProjectId(){return projectId;}
    public String getName(){return name;}
    public String getDescription(){return description;}

    /**Setters*/
    // should not be able to overwrite the generated id
//    public void setProjectId(@NonNull long projectId) {
//        this.projectId = projectId;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
