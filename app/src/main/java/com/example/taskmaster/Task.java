package com.example.taskmaster;

public class Task {

    /**Instance variables*/
    private String name;
    private Project project;
    /**
     * There will be Users later on, so a task should know who created that task, and who it is assigned to.
     * private User taskCreator;
     * private User assignedTo;
    */
    private String state;


    /**Constructors*/
    public Task(){}
    public Task (String name){
        this.name = name;
        this.state = "available";
    }

    /**Getters*/
    public String getName(){return name;}
    public Project getProject(){return project;}
    public String getState(){return state;}

    /**Setters*/
    public void setName(String newName){this.name = newName;}
    public void setProject(Project newProject){this.project = newProject;}
    public void setState(String newState){this.state = newState;}
}
