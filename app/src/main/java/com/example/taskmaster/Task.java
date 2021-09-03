package com.example.taskmaster;

import java.util.ArrayList;

public class Task {
    public String title;
    public String body;
    public String chosenState;
    public ArrayList<String> state =new ArrayList<String>(){
        {
            add("new");
            add("assigned");
            add("in progress");
            add("complete");
        }

    };


    public Task(String title, String body, String chosenState) {
        this.title = title;
        this.body = body;
        this.chosenState = this.state.get(state.indexOf(chosenState.toLowerCase()));
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

