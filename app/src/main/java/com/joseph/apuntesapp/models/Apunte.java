package com.joseph.apuntesapp.models;

/**
 * Created by josep on 05/04/2018.
 */

public class Apunte {
    private String titulo;
    private String contenido;
    private String etiqueta;

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
    public String toString() {
        return titulo;
    }
}
