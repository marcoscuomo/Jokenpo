package br.com.mojumob.jokenpo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    //Atributos
    private ImageView imgPedra, imgPapel, imgTesoura, imgComputador;
    private TextView txtResultado;

    //Constantes
    //Elementos
    private final String PEDRA = "Pedra";
    private final String PAPEL = "Papel";
    private final String TESOURA = "Tesoura";

    //Resultados
    private final String EMPATE = "Empate :|";
    private final String VITORIA = "Você ganhou :)";
    private final String DERROTA = "Você perdeu :(";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializações
        imgPedra      = findViewById(R.id.imgPedra);
        imgPapel      = findViewById(R.id.imgPapel);
        imgTesoura    = findViewById(R.id.imgTesoura);
        imgComputador = findViewById(R.id.imgComputador);
        txtResultado = findViewById(R.id.txtResultado);


        //Tratando evento clique nas imagens
        //Pedra
        imgPedra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogar(PEDRA);
            }
        });

        //Papel
        imgPapel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogar(PAPEL);
            }
        });

        //Tesoura
        imgTesoura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jogar(TESOURA);
            }
        });
    }

    private void jogar(String elemento) {

        String elementoComputador = escolhaComputador();
        String elementoUsuario = elemento;

        if(elementoUsuario == PEDRA){
            if(elementoComputador == PEDRA){
                txtResultado.setText(EMPATE);
            }else if(elementoComputador == PAPEL){
                txtResultado.setText(DERROTA);
            }else{
                txtResultado.setText(VITORIA);
            }
        }else if(elementoUsuario == PAPEL){
            if(elementoComputador == PEDRA){
                txtResultado.setText(VITORIA);
            }else if(elementoComputador == PAPEL){
                txtResultado.setText(EMPATE);
            }else{
                txtResultado.setText(DERROTA);
            }
        }else{
            if(elementoComputador == PEDRA){
                txtResultado.setText(DERROTA);
            }else if(elementoComputador == PAPEL){
                txtResultado.setText(VITORIA);
            }else{
                txtResultado.setText(EMPATE);
            }
        }

    }

    public String escolhaComputador(){

        /*Criando a escolha do computador
         * 0 - Pedra
         * 1 - Papel
         * 2 - Tesoura
         * */

        int valorComputador = new Random().nextInt(3);
        String elementoComputador;
        if(valorComputador == 0){
            elementoComputador = PEDRA;
            imgComputador.setImageResource(R.drawable.pedra_jogador);
        }else if(valorComputador == 1){
            elementoComputador = PAPEL;
            imgComputador.setImageResource(R.drawable.papel_jogador);
        }else{
            elementoComputador = TESOURA;
            imgComputador.setImageResource(R.drawable.tesoura_jogador);
        }

        return elementoComputador;

    }
}
