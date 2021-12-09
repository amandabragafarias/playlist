/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playlist.controller;

import com.playlist.dao.MusicaDAO;
import com.playlist.model.BasePlaylist;
import com.playlist.model.Cantor;
import com.playlist.model.Genero;
import com.playlist.model.Musica;
import com.playlist.model.Playlist;
import com.playlist.util.NegocioException;
import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class MusicaController {
    MusicaDAO musicaDao = new MusicaDAO();
   PlaylistController pControle = new PlaylistController();
    
    public void adicionarMusica(Musica musica) throws NegocioException{
        try{
            this.buscarMusicaPorTitulo(musica.getTitulo());
            throw new NegocioException("musica já cadastrada");
        }catch(NegocioException e){
            //Playlist playlist = pControle.buscarPorNome(musica.getPlaylist().getNomePlaylist());
          //  musica.setPlaylist(playlist);
            musicaDao.adicionarMusica(musica);
        }
        
    } public Musica buscarMusicaPorTitulo(String titulo) throws NegocioException{
        if(musicaDao.buscarMusicaPorTitulo(titulo)!=null){
            return musicaDao.buscarMusicaPorTitulo(titulo);
        }else{
            throw new NegocioException("Musica não encontrada");
        }
    }
    public ArrayList<Musica> buscarMusicaPorCantor(String nome) throws NegocioException{
        if(musicaDao.buscarMusicaPorCantor(nome)!=null){
            return musicaDao.buscarMusicaPorCantor(nome);
        }else{
            throw new NegocioException("Musica não encontrada");
        }
    }
     public ArrayList<Musica> buscarMusicaPorGenero(String genero) throws NegocioException{
        if(musicaDao.buscarMusicaPorGenero(genero)!=null){
            return musicaDao.buscarMusicaPorGenero(genero);
        }else{
            throw new NegocioException("Musica não encontrada");
        }
    }
    
    
    public Cantor buscarCantorPorMusica(String titulo) throws NegocioException{
        if(musicaDao.buscarCantorPorMusica(titulo)!=null){
            return musicaDao.buscarCantorPorMusica(titulo);
        }else{
            throw new NegocioException("Cantor não encontrado");
        }
    }
    
     public Genero buscarGeneroPorMusica(String titulo) throws NegocioException{
        if(musicaDao.buscarGeneroPorMusica(titulo)!=null){
            return musicaDao.buscarGeneroPorMusica(titulo);
        }else{
            throw new NegocioException("Genero não encontrado");
        }
    }
    
     public void deletarMusicaPorTitulo(String titulo) throws NegocioException{
        this.buscarMusicaPorTitulo(titulo);
        musicaDao.deletarMusicaPorTitulo(titulo);
    }
     
      public void deletarMusicaGenero(String titulo) throws NegocioException{
        
        musicaDao.deletarMusicaGenero(titulo);
    }
     
      public void deletarMusicaCantor(String titulo) throws NegocioException{
        
        musicaDao.deletarMusicaCantor(titulo);
    }
      
     public void atualizarMusica(String titulo, Musica musica) throws NegocioException{
       if ( this.buscarMusicaPorTitulo(titulo) != null){
        musicaDao.atualizarMusica(titulo, musica);}else{
           throw new NegocioException("Música não encontrada");
       }
    }
     
       public void atualizarCantor(String nome, Cantor cantor) throws NegocioException{
        this.buscarCantor(nome);
        musicaDao.atualizarCantor(nome, cantor);
    }
       
       public void atualizarGenero(String g, Genero genero) throws NegocioException{
        this.buscarGenero(g);
        musicaDao.atualizarGenero(g, genero);
    }
     
    
    public void adicionarCantor(Cantor cantor) throws NegocioException{
        try{
            this.buscarCantor(cantor.getNome());
            throw new NegocioException("cantor já cadastrado");
        }catch(NegocioException e){
            //Playlist playlist = pControle.buscarPorNome(musica.getPlaylist().getNomePlaylist());
          //  musica.setPlaylist(playlist);
            musicaDao.adicionarCantor(cantor);
        }
        
    }
     public Cantor buscarCantor(String nome) throws NegocioException{
        if(musicaDao.buscarCantor(nome)!=null){
            return musicaDao.buscarCantor(nome);
        }else{
            throw new NegocioException("Cantor não encontrado");
        }
    }
     public void deletarCantor(String nome) throws NegocioException{
        this.buscarCantor(nome);
        musicaDao.deletarCantor(nome);
    }
     
     
      public void vincularMusicaCantor(Musica musica, Cantor cantor) throws NegocioException{
        
            musicaDao.vincularMusicaCantor(musica, cantor);
        
        
    }
      public void vincularMusicaGenero(Musica musica, Genero genero) throws NegocioException{
        
            musicaDao.vincularMusicaGenero(musica, genero);
        
        
    }
       public void adicionarGenero(Genero genero) throws NegocioException{
       
            musicaDao.adicionarGenero(genero);
        
        
    }
     public Genero buscarGenero(String genero) throws NegocioException{
        if(musicaDao.buscarGenero(genero)!=null){
            return musicaDao.buscarGenero(genero);
        }else{
            throw new NegocioException("Genero não encontrado");
        }
    }
     public void deletarGenero(String genero) throws NegocioException{
        this.buscarGenero(genero);
        musicaDao.deletarGenero(genero);
    }
     public ArrayList<Musica> array() throws NegocioException{
        
            return musicaDao.array();
      
    }
       public ArrayList<Musica> mostrarMusicas(String nomePlaylist){
        
            return musicaDao.mostrarMusicas(nomePlaylist);
      
    }
          public void deletarPlaylistMusica(String titulo) throws NegocioException{
       
        musicaDao.deletarPlaylistMusica(titulo);
    }
      
}
