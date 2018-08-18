package br.com.mojumob.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Atributos
    private ImageView imgPedra, imgPapel, imgTesoura, imgComputador;
    private TextView txtResultador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializações
        imgPedra      = findViewById(R.id.imgPedra);
        imgPapel      = findViewById(R.id.imgPapel);
        imgTesoura    = findViewById(R.id.imgTesoura);
        imgComputador = findViewById(R.id.imgComputador);
        txtResultador = findViewById(R.id.txtResultado);
    }
}
