package fr.iut.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class todo extends AppCompatActivity {

    private EditText input;
    private ArrayList<String> todoList;
    private ListView listView;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        input = findViewById(R.id.etTache);
        listView = findViewById(R.id.list_item);
        todoList = new ArrayList<>();
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, todoList);
        listView.setAdapter(adapter);
    }

    public void onClickAjouter(View view){
        todoList.add(input.getText().toString());
        adapter.notifyDataSetChanged();
    }
}
