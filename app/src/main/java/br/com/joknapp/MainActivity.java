package br.com.joknapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectRock(View view) {
        this.selectOption("Pedra");
    }

    public void selectPaper(View view) {
        this.selectOption("Papel");
    }

    public void selectScissors(View view) {
        this.selectOption("Tesoura");
    }

    public void selectOption(String selectedUser) {

        ImageView imageRes = findViewById(R.id.imageResult);
        TextView textRes = findViewById(R.id.text_result);

        int num = new Random().nextInt(3);
        String[] options = {"Pedra", "Papel", "Tesoura"};
        String appOption = options[num];

        switch (appOption) {
            case "Pedra":
                imageRes.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imageRes.setImageResource(R.drawable.papel);
                break;
            case "Tesoura":
                imageRes.setImageResource(R.drawable.tesoura);
                break;
        }

        if (
                (appOption == "Tesoura" && selectedUser == "Papel") ||
                        (appOption == "Papel" && selectedUser == "Pedra") ||
                        (appOption == "Pedra" && selectedUser == "Tesoura")
        ) { //App Winner
            textRes.setText("O App Ganhou!!!");
        } else if (
                (selectedUser == "Tesoura" && appOption == "Papel") ||
                (selectedUser == "Papel" && appOption == "Pedra") ||
                (selectedUser == "Pedra" && appOption == "Tesoura")
        ) { //Play Winner
            textRes.setText("Parabéns, Você ganhou!!!");
        } else { //A Tie
            textRes.setText("Empatou!!!!!!");
        }

    }
}