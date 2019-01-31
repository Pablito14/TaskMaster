package com.example.taskmaster.database;

import com.example.taskmaster.Models.Task;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = (Task.class), version = 1, exportSchema = false)
public abstract class TaskDatabase extends RoomDatabase {
//    public abstract TaskDaoAccess DaoAccess();

}
