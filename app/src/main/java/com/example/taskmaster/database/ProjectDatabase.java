package com.example.taskmaster.database;

import com.example.taskmaster.Models.Project;

@Database(entities = (Project.class), version = 1, exportSchema = false)
public abstract class ProjectDatabase extends RoomDatabase{
}
