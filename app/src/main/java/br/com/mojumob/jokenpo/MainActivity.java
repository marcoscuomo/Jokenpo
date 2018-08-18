package br.com.mojumob.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

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


        //Tratando evento clique nas imagens
        //Pedra
        imgPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String elementoUsuario = "pedra";
                jogar(elementoUsuario);
            }
        });
    }

    private void jogar(String elementoUsuario) {

        String elementoComputador = escolhaComputador();


        Toast.makeText(this, elementoComputador, Toast.LENGTH_SHORT).show();


    }

    public String escolhaComputador(){

        /*Criando a escolha do computador
         * 0 - Pedra
         * 1 - Papel
         * 2 - Tesoura
         * */

        Random gerador = new Random();
        int valorComputador = gerador.nextInt(2);
        String elementoComputador = "";
        if(valorComputador == 0){
            elementoComputador = "Pedra";
        }else if(valorComputador == 1){
            elementoComputador = "Papel";
        }else{
            elementoComputador = "Tesoura";
        }

        return escolhaComputador();

    }
}
