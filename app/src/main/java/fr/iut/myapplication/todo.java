package fr.iut.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.List;

public class todo extends AppCompatActivity {

    private EditText input;
    private List String;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);
        input = findViewById(R.id.etTache);
    }

    public void onClickAjouter(View view){
        //RESTE A FAIRE !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

    }
}
