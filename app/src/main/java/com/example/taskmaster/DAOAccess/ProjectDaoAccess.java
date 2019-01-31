package com.example.taskmaster.DAOAccess;

import com.example.taskmaster.Models.Project;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;

@Dao
public interface ProjectDaoAccess {

    //add one project
    @Insert
    void insertProject(Project project);

    //delete one project
    @Delete()
    void delete(Project project);

    //select one project
    @Query("SELECT * FROM project WHERE id=:id")
    Project getById(long id);

    //update and exercise
    @Update
    void update(Project project);

    //delete all exercises
    @Query("DELETE FROM project")
    void deleteAll();

    //select all exercises
    @Query("SELECT * FROM project ORDER BY name ASC")
    ArrayList<Project> getAllExercises();

}
