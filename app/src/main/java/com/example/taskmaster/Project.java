package com.example.taskmaster;

import java.util.ArrayList;

public class Project {

    /**Instance variables*/
    private String name;
    private ArrayList<Task> Tasks;

    /**Constructors*/
    public Project(){}
    public Project (String name){
        this.name = name;
        this.Tasks = new ArrayList<>();
    }

}
