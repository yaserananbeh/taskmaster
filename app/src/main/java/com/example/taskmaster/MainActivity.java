package com.example.taskmaster;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//    Task task=new Task("test","testBody","assigned");
//        setContentView(R.layout.layoutName);
//        TextView textView = (TextView) findViewById(R.id.textView5);
//        textView.setText(task.toString());
        // Create some data
        ArrayList<Task> allTasks = new ArrayList<Task>();
        allTasks.add(new Task("task 1","do the lab","new"));
        allTasks.add(new Task("task 2","finish the reading","assigned"));
        allTasks.add(new Task("task 3","hanging out ","in progress"));
        allTasks.add(new Task("task 4","Play video games","in progress"));
        allTasks.add(new Task("task 5","do some resubmissions","complete"));
        RecyclerView allTasksRecycleView = findViewById(R.id.TaskListRecyclerView);
        allTasksRecycleView.setLayoutManager(new LinearLayoutManager(this));
        allTasksRecycleView.setAdapter(new TaskAdapter(allTasks));
//        Button showTasksBtn = findViewById(R.id.allTask);
//        showTasksBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View V) {
//                Intent renderAllTasksActivity = new Intent(MainActivity.this, AllTasks.class);
//                startActivity(renderAllTasksActivity);
//            }
//        });
//        Button addTaskButton = findViewById(R.id.addTask);
//        addTaskButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View V) {
//                Intent renderAllTasksActivity = new Intent(MainActivity.this, AddTask.class);
//                startActivity(renderAllTasksActivity);
//            }
//        });
//        Button task2Btn = findViewById(R.id.Task2Btn);
//        task2Btn.setOnClickListener((view -> {
//            String taskTitle = task2Btn.getText().toString();
//            Intent goToTaskDetail = new Intent(MainActivity.this , TaskDetail.class);
//            goToTaskDetail.putExtra("taskTitle", taskTitle);
//            startActivity(goToTaskDetail);
//        }));
//
//        Button task1Btn = findViewById(R.id.Task1Btn);
//        task1Btn.setOnClickListener((view -> {
//            String taskTitle = task1Btn.getText().toString();
//            Intent goToTaskDetail = new Intent(MainActivity.this , TaskDetail.class);
//            goToTaskDetail.putExtra("taskTitle", taskTitle);
//            startActivity(goToTaskDetail);
//        }));
    }
}