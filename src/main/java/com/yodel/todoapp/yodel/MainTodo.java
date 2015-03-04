package com.yodel.todoapp.yodel;

/**
 * Created by NenoandLaura on 2/26/2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainTodo extends Activity{

    Button btnViewTodos;
    Button btnNewTodo;
    Button btnViewTobuy;
    Button btnNewTobuy;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_first);

        // Buttons
        btnNewTodo = (Button) findViewById(R.id.addTodoButton);
        btnViewTodos = (Button) findViewById(R.id.viewTodoList);
        btnNewTobuy = (Button) findViewById(R.id.addTobuyItem);
        btnViewTobuy = (Button) findViewById(R.id.viewTobuyList);


        // view products click event
        btnViewTodos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching All products Activity
                Intent i = new Intent(getApplicationContext(), AllTodoActivity.class);
                startActivity(i);

            }
        });

        // view products click event
        btnNewTodo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching create new product activity
                Intent i = new Intent(getApplicationContext(), NewTodoActivity.class);
                startActivity(i);

            }
        });


        btnViewTobuy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching All products Activity
                Intent i = new Intent(getApplicationContext(), AllToBuyActivity.class);
                startActivity(i);

            }
        });

        // view products click event
        btnNewTobuy.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Launching create new product activity
                Intent i = new Intent(getApplicationContext(), NewToBuyActivity.class);
                startActivity(i);

            }
        });
    }
}
