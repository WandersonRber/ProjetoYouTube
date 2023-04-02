package com.example.projetoyoutube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetoYouTubeApplication {

    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO");
        v[1] = new Video("Aula 12 de PHP");
        v[2] = new Video("Aula 10 de HTMLS");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jubileu", 22, "M", "juba");
        g[1] = new Gafanhoto("Creuza", 25, "F", "Creuzita");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(80.8f);
        System.out.println(vis[0].toString());


        /*System.out.println("VíDEOS\n--------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nGAFANHOTOS\n-------------");
        System.out.println(g[0].toString());
        System.out.println(v[0].toString());*/
    }

}
