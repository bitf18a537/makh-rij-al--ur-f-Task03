package com.example.arabicwords;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int COUNT =0;
    int MARKS =0;
    TextView textViewGuessLetter, textViewShowAnswer;

    Button bgetletter, bHalqiyah,bLahatiyah,bHaafiyah,bTarfiyah,bNiteeyah,bLisaveyah,bGhunna;
    Button showresult;

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

        bgetletter = findViewById(R.id.gl);
        bHalqiyah = findViewById(R.id.hal);
        bLahatiyah = findViewById(R.id.lah);
        bHaafiyah = findViewById(R.id.haa);
        bTarfiyah = findViewById(R.id.tar);
        bNiteeyah = findViewById(R.id.nit);
        bLisaveyah = findViewById(R.id.lis);
        bGhunna = findViewById(R.id.gun);

        // on click listener for sending data from activity main to activity 2
        showresult = findViewById(R.id.result);


        showresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String final_marks= String.valueOf(MARKS);
                if (COUNT >= 5)
                {
                    Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                    intent.putExtra("value", final_marks);
                    startActivity(intent);

                }



            }
        });


    }

    public void Getletter(View view) {
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


    public void ShowResult(String studentResult)
    {

        if(studentResult == realAnswer)
        {   textViewShowAnswer.setText("OK");
            textViewShowAnswer.setBackgroundColor(Color.GREEN);
            MARKS++;
        }
        else
        {
            textViewShowAnswer.setText("OOPS");
            textViewShowAnswer.setBackgroundColor(Color.RED);
        }

        COUNT++;
    }

    // on click listner for show result

    /*public void FinalResult(View v)
    {

        if (count==1)
        {
            Intent fintent = new Intent(MainActivity.this, MainActivity2.class);
            fintent.putExtra("value", marks);
            startActivity(fintent);

        }
    }*/
}