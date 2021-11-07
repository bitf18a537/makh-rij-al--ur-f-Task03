package com.example.arabicwords;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String [] Halqiyah  = {"خ", "غ","ح","ع","ہ","أ"};
    String [] Lahatiyah  = {"ک", "ق"};
    String [] Haafiyah  = {"ض", "ی","ش","ج"};

    String [] Tarfiyah  = {"ر","ن","ل"};
    String [] Niteeyah  = {"ط","د","ت",};
    String [] Lisaveyah  = {"ز","س", "ص", "ث","ذ","ظ"};
    String [] Ghunna  = {"ن", "و","ب","ف","م"};
    String realAnswer= "", studentAnswer="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void GetLetter(View view) {
        Random random = new Random();
        int letterToDsiplay = random.nextInt(7);
        if(letterToDsiplay==0){
            realAnswer = "Sky Letters";
            int i = SkyLetters.length;
            textViewGuessLetter.setText(SkyLetters[random.nextInt(i)]);
        } else if (letterToDsiplay==1){
            realAnswer = "Grass Letters";
            int i = grassLetters.length;
            textViewGuessLetter.setText(grassLetters[random.nextInt(i)]);
        }else {
            realAnswer = "Root Letters";
            int i = rootLetter.length;
            textViewGuessLetter.setText(rootLetter[random.nextInt(i)]);
        }
    }
}