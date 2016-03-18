package com.example.android.melhorarsuamemoria;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void startSecondActivity(View view) {

        Intent secondActivity = new Intent(this, Main2Activity.class);
        startActivity(secondActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Chama o Texto com cliques no botoes
     */
    public void dica1(View view) {

        // Chama o titulo
        TextView textViewDica1 = (TextView) findViewById(R.id.dica);
        textViewDica1.setText("1 – Adivinhe");

        // Chama o texto
        TextView textViewResumo1 = (TextView) findViewById(R.id.resumo);
        textViewResumo1.setText("Uma das melhores maneiras de lembrar uma palavra nova, por incrível que pareça, é adivinhar o seu significado antes mesmo de conhecê-lo. É provável que você esteja errado, claro. “Mas apenas o ato de adivinhar pode significar que você se lembrará da resposta correta muito melhor do que se você não adivinhasse”, diz Cooke. O método também funciona com nomes. Tentar adivinhar o nome de uma pessoa quando se reunir com ela pela primeira vez fará você nunca mais esquecê-lo, no futuro.");
    }

    public void dica2(View view) {

        // Find a reference to the TextView in the layout. Change the text.
        TextView textViewDica2 = (TextView) findViewById(R.id.dica);
        textViewDica2.setText("2 – Repetição");

        // Find a reference to the TextView in the layout. Change the text.
        TextView textViewResumo2 = (TextView) findViewById(R.id.resumo);
        textViewResumo2.setText("A repetição é a chave para a memória. Mas uma inovação, chamada megaperfuração, tem se revelado especialmente poderosa. De acordo com essa técnica, “você tem que se lembrar ativamente da mesma memória por 30 vezes”, diz Cooke. Então, quando você conhecer alguém novo, tente repetir seu nome 30 vezes para garantir a lembrança.");
    }

    public void dica3(View view) {

        // Find a reference to the TextView in the layout. Change the text.
        TextView textViewDica3 = (TextView) findViewById(R.id.dica);
        textViewDica3.setText("3 – Criar um mnemônico");

        // Find a reference to the TextView in the layout. Change the text.
        TextView textViewResumo3 = (TextView) findViewById(R.id.resumo);
        textViewResumo3.setText("Associe uma comparação à palavra pelo modo como ela soa. “Isso ajuda a ligar a palavra ao conhecimento que você já tem em sua mente, e a qualidade da memória formada é muito maior”, diz Cooke.");
    }

    public void dica4(View view) {

        // Find a reference to the TextView in the layout. Change the text.
        TextView textViewDica4 = (TextView) findViewById(R.id.dica);
        textViewDica4.setText("4 – Pense espacialmente");

        // Find a reference to the TextView in the layout. Change the text.
        TextView textViewResumo4 = (TextView) findViewById(R.id.resumo);
        textViewResumo4.setText("“Os seres humanos têm uma memória incrível para o espaço”, diz Cooke. Uma estratégia eficaz para a memorização de palavras é imaginar um quarto, e em seguida, anexar a palavra e seu significado a um lugar no cômodo.");
    }

    public void dica5(View view) {

        // Find a reference to the TextView in the layout. Change the text.
        TextView textViewDica5 = (TextView) findViewById(R.id.dica);
        textViewDica5.setText("5 – Relaxar");

        // Find a reference to the TextView in the layout. Change the text.
        TextView textViewResumo5 = (TextView) findViewById(R.id.resumo);
        textViewResumo5.setText("Uma das técnicas mais importantes para a memória é fazer uma pausa nos pensamentos, como por exemplo, assistindo um vídeo de uma cachoeira. “Desperdiçamos muito tempo, mas, o processo de olhar para um vídeo de uma cachoeira, que acalma e relaxa o cérebro, criando uma lacuna, de certa forma, forma novas memórias para mais tarde. Ter tempo para descansar seu cérebro pode realmente acelerá-lo a longo prazo”, concluiu.");
    }

}
