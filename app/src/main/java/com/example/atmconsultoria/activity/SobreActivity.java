package com.example.atmconsultoria.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sobre);
        String descricao = "A ATM Consultoria tem como missão apoiar nossos parceiros á obter sucesso em seus ramos de trabalho oferecendo soluções práticas e eficientes para a obtenção de resultados.\n" +
                "Sempre prezando pela qualidade e resposta rápida na obtenção dos resultados, a ATM Consultoria garante melhorar e expandir os seus negócios para um nível superior.";
        View sobre = new AboutPage(this)
                .setImage(R.drawable.logo_atm)
                .setDescription(descricao)
                .addGroup("Fale conosco")
                .addEmail("atmconsultoria@gmail.com", "Envie um e-mail")
                .addWebsite("https://www.google.com.br", "Acesse nosso site")
                .addGroup("Acesse nossas redes sociais")
                .addFacebook("google", "Facebook")
                .addTwitter("google", "Twitter")
                .addYoutube("google", "Youtube")
                .addPlayStore(".com.google.android.apps.plus", "Play Store")
                .addGitHub("google", "Github")
                .addInstagram("google", "Instagram")
                .create();

        setContentView(sobre);
    }
}
