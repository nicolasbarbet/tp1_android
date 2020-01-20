package fr.iut.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class prenom extends AppCompatActivity {

    private EditText input;
    private TextView tvPrenom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prenom);
        input = findViewById(R.id.editText);
        tvPrenom = findViewById(R.id.textView2);
    }


    public void onClickValider(View view){
        String prenom = "Bonjour " + input.getText().toString() + " !";
        tvPrenom.setText(prenom);
        tvPrenom.setVisibility(View.VISIBLE);
        Toast.makeText(prenom.this, prenom, Toast.LENGTH_LONG).show();

    }
}
