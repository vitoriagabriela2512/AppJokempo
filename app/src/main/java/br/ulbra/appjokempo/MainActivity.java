package br.ulbra.appjokempo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int pontuacaoJogador = 0;
    int pontuacaoApp = 0;

    TextView txtResultado;
    TextView txtPlacar;
    ImageView imgApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txtResultado = findViewById(R.id.txtResultado);
        txtPlacar = findViewById(R.id.txtPlacar);
        imgApp = findViewById(R.id.imgApp);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("pedra");
    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("papel");
    }


    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("tesoura");
    }

    public void opcaoSelecionada(String opcaoSelecionada) {

        String opcoes[] = {"pedra", "papel", "tesoura"};

        String opcaoApp = opcoes[new Random().nextInt(3)];

        switch (opcaoApp) {

            case "pedra":
                imgApp.setImageResource(R.drawable.img);
                break;

            case "papel":
                imgApp.setImageResource(R.drawable.papel);
                break;

            case "tesoura":
                imgApp.setImageResource(R.drawable.tesoura);
                break;
        }

        if (
                (opcaoApp.equals("tesoura") && opcaoSelecionada.equals("papel")) ||
                        (opcaoApp.equals("papel") && opcaoSelecionada.equals("pedra")) ||
                        (opcaoApp.equals("pedra") && opcaoSelecionada.equals("tesoura"))
        ) {

            txtResultado.setText("Resultado: Você PERDEU :( ");

            pontuacaoApp++;

        } else if (
                (opcaoSelecionada.equals("tesoura") && opcaoApp.equals("papel")) ||
                        (opcaoSelecionada.equals("papel") && opcaoApp.equals("pedra")) ||
                        (opcaoSelecionada.equals("pedra") && opcaoApp.equals("tesoura"))
        ) {

            txtResultado.setText("Resultado: Você GANHOU :D");

            pontuacaoJogador++;

        } else {

            txtResultado.setText("Resultado: EMPATE :|");
        }

        atualizarPlacar();
    }

    // PLACAR
    public void atualizarPlacar() {

        txtPlacar.setText(
                "Jogador: " + pontuacaoJogador +
                        " | App: " + pontuacaoApp
        );
    }

    // REINICIAR
    public void reiniciarJogo(View view) {

        pontuacaoJogador = 0;
        pontuacaoApp = 0;

        atualizarPlacar();

        txtResultado.setText("Escolha uma opção");

        imgApp.setImageResource(R.drawable.padrao);
    }
}