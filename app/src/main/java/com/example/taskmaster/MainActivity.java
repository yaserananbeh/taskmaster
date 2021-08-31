package com.example.taskmaster;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showTasksBtn = findViewById(R.id.allTask);
        showTasksBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent renderAllTasksActivity = new Intent(MainActivity.this, AllTasks.class);
                startActivity(renderAllTasksActivity);
            }
        });
        Button addTaskButton = findViewById(R.id.addTask);
        addTaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent renderAllTasksActivity = new Intent(MainActivity.this, AddTask.class);
                startActivity(renderAllTasksActivity);
            }
        });
        Button task2Btn = findViewById(R.id.Task2Btn);
        task2Btn.setOnClickListener((view -> {
            String taskTitle = task2Btn.getText().toString();
            Intent goToTaskDetail = new Intent(MainActivity.this , TaskDetail.class);
            goToTaskDetail.putExtra("taskTitle", taskTitle);
            startActivity(goToTaskDetail);
        }));

        Button task1Btn = findViewById(R.id.Task1Btn);
        task1Btn.setOnClickListener((view -> {
            String taskTitle = task1Btn.getText().toString();
            Intent goToTaskDetail = new Intent(MainActivity.this , TaskDetail.class);
            goToTaskDetail.putExtra("taskTitle", taskTitle);
            startActivity(goToTaskDetail);
        }));
    }
}