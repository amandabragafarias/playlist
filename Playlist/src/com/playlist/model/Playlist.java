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
public class Playlist {
    private String nomePlaylist;
   // private Musica musica;



    /**
     * @return the nome_playlist
     */
    public String getNomePlaylist() {
        return nomePlaylist;
    }

    /**
     * @param nome_playlist the nome_playlist to set
     */
    public void setNomePlaylist(String nomePlaylist) {
        this.nomePlaylist = nomePlaylist;
    }

    /**
     * @return the musica
     */
   /* public Musica getMusica() {
        return musica;
    }

    /**
     * @param musica the musica to set
     */
     /*public void setMusica(Musica musica) {
        this.musica = musica;
    }*/
     public Playlist(String nomePlaylist){
         this.nomePlaylist=nomePlaylist;
         //this.musica=musica;
     }
    
}
