package com.example.carlos.socialnetwork;

import android.util.Log;

import java.util.ArrayList;

public class Network {

    private String imagen;
    private String nombre;
    private String descripcion;
    private ArrayList<String> listNameNetworks;
    private ArrayList<Network> listNetworks;


    public Network() {
        this.listNameNetworks = new ArrayList<>();
        this.listNetworks = new ArrayList<>();


        this.listNameNetworks.add("Facebook");
        this.listNameNetworks.add("Youtube");
        this.listNameNetworks.add("Twitter");

        this.imagen ="ic_facebook_material_circle";
        this.nombre = "Facebook";
        this.descripcion = "Facebook es un sitio web de redes sociales creado por Mark Zuckerberg y fundado junto a Eduardo Saverin, Chris Hughes y Dustin Moskovitz. ";
        this.listNetworks.add(this);

        this.imagen ="ic_youtubematerial_circle";
        this.nombre = "Youtube";
        this.descripcion = "Facebook es un sitio web de redes sociales creado por Mark Zuckerberg y fundado junto a Eduardo Saverin, Chris Hughes y Dustin Moskovitz. ";
        this.listNetworks.add(this);

        this.imagen ="ic_twitter_material_circle";
        this.nombre = "Twitter";
        this.descripcion = "Facebook es un sitio web de redes sociales creado por Mark Zuckerberg y fundado junto a Eduardo Saverin, Chris Hughes y Dustin Moskovitz. ";
        this.listNetworks.add(this);

    }


    public String getImagen() {
        return imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<String> getListNameNetworks() {
        return listNameNetworks;
    }

    public ArrayList<Network> getListNetworks() {
        return listNetworks;
    }

}
