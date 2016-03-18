package com.example.android.melhorarsuamemoria;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {

    public void startPrimeiraActivity(View view) {

        Intent primeiraActivity = new Intent(this, MainActivity.class);
        startActivity(primeiraActivity);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    /**
     * Dados para enviar para email de contato
     * @param view
     */
    public void enviar(View view) {

        EditText nome = (EditText) findViewById(R.id.nome);
        String nomes = nome.getText().toString();

        EditText idade = (EditText) findViewById(R.id.idade);
        String idades = idade.getText().toString();

        EditText cidade = (EditText) findViewById(R.id.cidade);
        String cidades = cidade.getText().toString();

        EditText texto = (EditText) findViewById(R.id.texto);
        String textos = texto.getText().toString();

        String dados = createOrderSummary(nomes, idades, cidades, textos);


        Intent intent2 = new Intent(Intent.ACTION_SENDTO);
        intent2.setData(Uri.parse("mailto:appmelhorarsuamemoria@hotmail.com")); // only email apps should handle this
        intent2.putExtra(Intent.EXTRA_SUBJECT, "Contato de " + nomes);
        intent2.putExtra(Intent.EXTRA_TEXT, dados);
        if (intent2.resolveActivity(getPackageManager()) != null) {
            startActivity(intent2);
        }

    }
        private String createOrderSummary (String nomes, String idades, String cidades, String textos) {
            String dados = "Nome: " + nomes;
            dados = dados + " \nData de Nascimento: " + idades;
            dados = dados + " \nCidade - UF: " + cidades;
            dados = dados + " \nMensagem: " + textos;
            dados = dados + " \nObrigado!";
            return dados;

        }


}
