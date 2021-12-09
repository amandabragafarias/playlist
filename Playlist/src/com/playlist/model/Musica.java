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
public class Musica {
    private String titulo;
    private String arquivo;
    //private String nomeCantor;
    //private String genero;
    //private Playlist playlist;
    


    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the duracao
     */
    

    /**
     * @return the cantor
     */
    /*public String getNomeCantor() {
        return nomeCantor;
    }*/

    /**
     * @param cantor the cantor to set
     */
    /*public void setNomeCantor(String nomeCantor) {
        this.nomeCantor = nomeCantor;
    }*/
/**
     * @return the genero
     */
   /* public String getGenero() {
        return genero;
    }*/

    /**
     * @param titulo the enero to set
     */
    /*public void setGenero(String genero) {
        this.genero = genero;
    }*/
    

    /**
     * @return the playlist
     */
   /* public Playlist getPlaylist() {
        return playlist;
    }

    /**
     * @param playlist the playlist to set
     */
    /*public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }*/
     public Musica(String titulo){
       this.titulo=titulo;
      // this.nomeCantor=nomeCantor;
      // this.genero = genero;
       //this.playlist=playlist;
   }

    /**
     * @return the arquivo
     */
    public String getArquivo() {
        return arquivo;
    }

    /**
     * @param arquivo the arquivo to set
     */
    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
    
}
