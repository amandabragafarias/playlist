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
public class Genero {
    private String genero;

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
     
    public Genero (String genero){
        this.genero=genero;
    }
}
