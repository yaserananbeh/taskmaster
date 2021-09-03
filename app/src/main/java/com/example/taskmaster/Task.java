package com.example.taskmaster;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.ArrayList;
@Entity
public class Task {
    @PrimaryKey(autoGenerate = true)
    public int uid;
    @ColumnInfo(name = "title")
    public String title;
    @ColumnInfo(name = "body")
    public String body;
    @ColumnInfo(name = "chosenState")
    public String chosenState;
//    public ArrayList<String> state =new ArrayList<String>(){
//        {
//            add("new");
//            add("assigned");
//            add("in progress");
//            add("complete");
//        }
//
//    };


    public Task(String title, String body, String chosenState) {
        this.title = title;
        this.body = body;
//        this.chosenState = this.state.get(state.indexOf(chosenState.toLowerCase()));
        this.chosenState = chosenState;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", chosenState='" + chosenState + '\'' +
                '}';
    }
}

