package com.example.carlos.socialnetwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Network> list_networks;
    private ArrayList<String> list_name_networks;
    private Network network;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        network = new Network();
        list_networks = new ArrayList<Network>();
        list_name_networks = new ArrayList<>();
        fillNetworks();
        fillListNetworks();
    }

    public void fillListNetworks(){
        list_name_networks.add("Facebook");
        list_name_networks.add("Youtube");
        list_name_networks.add("Twitter");

    }

    public void fillNetworks(){
        network.setNombre("Facebook");
        network.setDescripcion("Facebook es un sitio web de redes sociales creado por Mark Zuckerberg y fundado junto a Eduardo Saverin, Chris Hughes y Dustin Moskovitz. En sus inicios, se trataba de un sitio para estudiantes de la Universidad de Harvard.");
        network.setImagen("@drawable/ic_facebook_material_circle");
        list_networks.add(network);

        network.setNombre("Youtube");
        network.setDescripcion("YouTube es un sitio web dedicado a compartir vídeos. Presenta una variedad de clips de películas, programas de televisión y vídeos musicales, así como contenidos amateur como videoblogs y YouTube Gaming");
        network.setImagen("@drawable/ic_youtubematerial_circle");
        list_networks.add(network);

        network.setNombre("Twitter");
        network.setDescripcion("Twitter es un servicio de microblogging, con sede en San Francisco, California, con filiales en San Antonio y Boston en Estados Unidos. Twitter, Inc. fue creado originalmente en California, pero está bajo la jurisdicción de Delaware desde 2007.");
        network.setImagen("@drawable/ic_twitter_material_circle");
        list_networks.add(network);
    }


    public ArrayList<Network> getList_networks() {

        return list_networks;

    }

    public ArrayList<String> getList_name_networks() {

        return list_name_networks;
    }

}
