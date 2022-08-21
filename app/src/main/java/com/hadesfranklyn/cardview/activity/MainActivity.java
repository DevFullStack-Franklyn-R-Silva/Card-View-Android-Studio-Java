package com.hadesfranklyn.cardview.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.hadesfranklyn.cardview.R;
import com.hadesfranklyn.cardview.adapter.PostagemAdapter;
import com.hadesfranklyn.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        // Muda a orientacao para Horizontal
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(RecyclerView.HORIZONTAL);

        //Grid layout
//        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerPostagem.setLayoutManager(layoutManager);

        //Define adapter
        this.prepararPostagens();

        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens() {
        Postagem p = new Postagem("Franklyn Roberto", "#tbt Viagem Legal!", R.drawable.img1);
        this.postagens.add(p);
        p = new Postagem("Hotel Pequeno Príncipe", "Viaje, aproveite nosso desconto!", R.drawable.imagem2);
        this.postagens.add(p);
        p = new Postagem("Maria Luiza", "#Paris!!!", R.drawable.imagem3);
        this.postagens.add(p);
        p = new Postagem("Marcos Paulo", "#Que foto linda!", R.drawable.imagem4);
        this.postagens.add(p);
    }
}