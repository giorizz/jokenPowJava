package br.com.joknapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectRock(View view){
        this.selectOption("Pedra");
    }

    public void selectPaper(View view){
        this.selectOption("Papel");
    }

    public void selectScissors(View view){
        this.selectOption("Tesoura");
    }

    public void selectOption(String selectedUser){

        ImageView imageRes = findViewById(R.id.imageResult);

        int num = new Random().nextInt(3);
        String[] options = {"Pedra", "Papel", "Tesoura"};
        String appOption = options[num];

        switch (appOption){
            case "Pedra":
                imageRes.setImageResource(R.drawable.pedra);
                break;
        }

    }
}