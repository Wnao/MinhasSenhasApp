package br.usjt.devmobile.minhassenhasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetalhesSenhaActivity extends AppCompatActivity {

    private Senha senha;
    private TextView textViewSenha;
    private TextView textViewSenha1;
    private TextView textViewSenha2;
    private TextView textViewSenha3;
    private TextView textViewSenha4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_senha);
        Intent intent = getIntent();
        senha = (Senha)intent.getSerializableExtra("senha");
        textViewSenha = findViewById(R.id.textViewNomeValue);
        textViewSenha.setText(senha.getNome());
        textViewSenha1 = findViewById(R.id.textViewNomeValue1);
        textViewSenha1.setText(senha.getNome());
        textViewSenha2 = findViewById(R.id.textViewNomeValue2);
        textViewSenha2.setText(senha.getNome());
        textViewSenha3 = findViewById(R.id.textViewNomeValue3);
        textViewSenha3.setText(senha.getNome());
        textViewSenha4 = findViewById(R.id.textViewNomeValue4);
        textViewSenha4.setText(senha.getNome());
    }
}
