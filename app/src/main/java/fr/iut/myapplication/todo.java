package fr.iut.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class todo extends AppCompatActivity {

    private EditText input;

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
