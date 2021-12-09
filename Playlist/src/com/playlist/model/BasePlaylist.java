/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playlist.model;

/**
 *
 * @author Amanda
 */
public class BasePlaylist {
    private Musica musica;
    private Cantor cantor;
    private Genero genero;

    /**
     * @return the musica
     */
    public Musica getMusica() {
        return musica;
    }

    /**
     * @param musica the musica to set
     */
    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    /**
     * @return the cantor
     */
    public Cantor getCantor() {
        return cantor;
    }

    /**
     * @param cantor the cantor to set
     */
    public void setCantor(Cantor cantor) {
        this.cantor = cantor;
    }

    /**
     * @return the genero
     */
    public Genero getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    public BasePlaylist (Musica musica, Cantor cantor, Genero genero){
        this.musica=musica;
        this.cantor=cantor;
        this.genero=genero;
       
    }
    
}
