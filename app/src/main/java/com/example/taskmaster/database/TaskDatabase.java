package com.example.taskmaster.database;

import com.example.taskmaster.Models.Task;
import androidx.room.Database;

@Database(entities = (Task.class), version = 1, exportSchema = false)
public abstract class TaskDatabase extends RoomDatabase{
    public abstract TaskDaoAccess DaoAccess();

}
