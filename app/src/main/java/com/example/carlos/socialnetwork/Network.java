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

    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
