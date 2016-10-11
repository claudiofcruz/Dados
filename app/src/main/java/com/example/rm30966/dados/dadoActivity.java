package com.example.rm30966.dados;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class dadoActivity extends AppCompatActivity {

    private ImageView imgDado1, imgDado2;
    private TextView txtGanhador;
    private int arDados[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dado);
        imgDado1 = (ImageView) findViewById(R.id.imgJogador);
        imgDado2 = (ImageView) findViewById(R.id.imgComputer);
        txtGanhador = (TextView) findViewById(R.id.txtGanhador);

        arDados = new int[] {R.drawable.dado1,R.drawable.dado2,R.drawable.dado3,
                R.drawable.dado4,R.drawable.dado5,R.drawable.dado6};


    }

    public void jogar (View v)
    {
        Random rJogador = new Random();
        int sJogador = rJogador.nextInt(5);

        Random rComputador = new Random();
        int sComputador = rComputador.nextInt(5);

        imgDado1.setImageResource(arDados[sJogador]);
        imgDado2.setImageResource(arDados[sComputador]);

        if(sJogador > sComputador)
        {
            txtGanhador.setText(R.string.msgJogadorWin);
        }else if(sComputador > sJogador)
        {
            txtGanhador.setText(R.string.msgComputerWin);
        }else
        {
            txtGanhador.setText(R.string.msgEmpate);
        }
    }
}
