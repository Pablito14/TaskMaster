package com.example.taskmaster.database;

import com.example.taskmaster.DAOAccess.ProjectDaoAccess;
import com.example.taskmaster.Models.Project;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = (Project.class), version = 1, exportSchema = false)
public abstract class ProjectDatabase extends RoomDatabase{
    public abstract ProjectDaoAccess DaoAccess();
}
