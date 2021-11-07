package com.example.arabicwords;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView textViewGuessLetter, textViewShowAnswer;

    Button bgetletter, bHalqiyah,bLahatiyah,bHaafiyah,bTarfiyah,bNiteeyah,bLisaveyah,bGhunna;

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

        textViewGuessLetter = findViewById(R.id.getview);
        textViewShowAnswer = findViewById(R.id.getanswer);

    }

    public void GetLetter(View view) {
        Random random = new Random();
        int letterToDsiplay = random.nextInt(7);
        if(letterToDsiplay==0)
        {
            realAnswer = "Halqiyah";
            int i = Halqiyah.length;
            textViewGuessLetter.setText(Halqiyah[random.nextInt(i)]);
        }
        else if (letterToDsiplay==1)
        {
            realAnswer = "Lahatiyah";
            int i = Lahatiyah.length;
            textViewGuessLetter.setText(Lahatiyah[random.nextInt(i)]);
        }
        else if (letterToDsiplay==2)
        {
            realAnswer = "Haafiyah";
            int i = Haafiyah.length;
            textViewGuessLetter.setText(Haafiyah[random.nextInt(i)]);
        }

        else if (letterToDsiplay==3)
        {
            realAnswer = "Tarfiyah";
            int i = Tarfiyah.length;
            textViewGuessLetter.setText(Tarfiyah[random.nextInt(i)]);
        }

        else if (letterToDsiplay==4)
        {
            realAnswer = "Niteeyah";
            int i = Niteeyah.length;
            textViewGuessLetter.setText(Niteeyah[random.nextInt(i)]);
        }

        else if (letterToDsiplay==5)
        {
            realAnswer = "Lisaveyah";
            int i = Lisaveyah.length;
            textViewGuessLetter.setText(Lisaveyah[random.nextInt(i)]);
        }
        else
        {
            realAnswer = "Ghunna";
            int i = Ghunna.length;
            textViewGuessLetter.setText(Ghunna[random.nextInt(i)]);
        }

    }

    public void Halqiyah(View view)
    {
        studentAnswer = "Halqiyah";
        ShowResult(studentAnswer);
    }

    public void Lahatiyah(View view)
    {
        studentAnswer = "Lahatiyah";
        ShowResult(studentAnswer);
    }
    public void Haafiyah(View view)
    {
        studentAnswer = "Haafiyah";
        ShowResult(studentAnswer);
    }
    public void Tarfiyah(View view)
    {
        studentAnswer = "Tarfiyah";
        ShowResult(studentAnswer);
    }
    public void Niteeyah(View view)
    {
        studentAnswer = "Niteeyah";
        ShowResult(studentAnswer);
    }
    public void Lisaveyah(View view)
    {
        studentAnswer = "Lisaveyah";
        ShowResult(studentAnswer);
    }
    public void Ghunna(View view)
    {
        studentAnswer = "Ghunna";
        ShowResult(studentAnswer);
    }


    public void ShowResult(String studentAnswer)
    {
        
    }
}