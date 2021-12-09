/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playlist.controller;

import com.playlist.dao.PlaylistDAO;
import com.playlist.model.BasePlaylist;
import com.playlist.model.Musica;
import com.playlist.model.Playlist;
import com.playlist.util.NegocioException;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class PlaylistController {
    PlaylistDAO playlistDao = new PlaylistDAO();
    
    
      public void criarPlaylist(Playlist playlist) throws NegocioException{
        try{
            this.buscarPorNome(playlist.getNomePlaylist());
            throw new NegocioException("playlist já cadastrada");
        }catch(NegocioException e){
            playlistDao.criarPlaylist(playlist);
        }
    }
    
    public Playlist buscarPorNome(String nomePlaylist) throws NegocioException{
        if(playlistDao.buscarPorNome(nomePlaylist)!=null){
            return playlistDao.buscarPorNome(nomePlaylist);
        }else{
            throw new NegocioException("playlist não cadastrada.");
        }
    }

    
      public void vincularMusicaPlaylist(Musica musica, Playlist playlist) throws NegocioException{
        
            playlistDao.vincularMusicaPlaylist(musica, playlist);
        
        
    }
      
      
      public void deletarPlaylist(String nomePlaylist) throws NegocioException{
        this.buscarPorNome(nomePlaylist);
        playlistDao.deletarPlaylist(nomePlaylist);
    }
      public void removerMusicaDaPlaylist(String titulo, String nomePlaylist) throws NegocioException{
        
        playlistDao.removerMusicaDaPlaylist(titulo, nomePlaylist);
    }
      
       public void deletarPlaylistMusica(String nomePlaylist) throws NegocioException{
       playlistDao.deletarPlaylistMusica(nomePlaylist);
    }
       public ArrayList<Playlist> arrayPlaylists() throws NegocioException{
        
            return playlistDao.arrayPlaylists();
      
    }
        public void atualizarPlaylist(String nomePlaylist, Playlist playlist) throws NegocioException{
        
        playlistDao.atualizarPlaylist(nomePlaylist, playlist);
    }
     
         public void atualizar(String nomePlaylist, Playlist playlist) throws NegocioException{
        
        playlistDao.atualizar(nomePlaylist, playlist);
    }
    
       
   /* public ArrayList<Playlist>playlistss() throws NegocioException{
        if(playlistDao.playlistss()!=null){
            return playlistDao.playlistss();
        }else{
            throw new NegocioException("Não encontrado");
        }
    }*/
}
