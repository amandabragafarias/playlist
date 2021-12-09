/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.playlist.dao;

import com.playlist.controller.MusicaController;
import com.playlist.model.BasePlaylist;
import com.playlist.model.Cantor;
import com.playlist.model.Genero;
import com.playlist.model.Musica;
import com.playlist.model.Playlist;
import com.playlist.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Amanda
 */
public class MusicaDAO {
     ArrayList<Musica> itens = new ArrayList<>();
     ArrayList<BasePlaylist> p = new ArrayList<>();
      ArrayList<Musica> musicas = new ArrayList<>();
    
    
    public void adicionarMusica(Musica musica) {
        Connection conn = null;
        PreparedStatement pstm = null;
        String sql = "insert "
                + "into musica(titulo, arquivo)"
                + " values(?, ?)";
    try { 
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, musica.getTitulo());
            pstm.setString(2, musica.getArquivo());
            //pstm.setString(3, musica.getGenero());
            //pstm.setString(4, musica.getPlaylist().getNomePlaylist());  
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
           try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public Musica buscarMusicaPorTitulo(String titulo) {
        
        String sql = "select * from musica"
                + " where titulo=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;

        try {
            
            conn = ConnectionFactory.getConexao();
            
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, titulo);
            
            rset = pstm.executeQuery();

            Musica musica = new Musica(null);
            
            while (rset.next()) {
               
                Playlist playlist = new Playlist(null);
                musica.setTitulo(rset.getString("titulo"));
               musica.setArquivo(rset.getString("arquivo"));
                
                return musica;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    
 public void deletarMusicaPorTitulo(String titulo) {
        String sql = "delete from musica where titulo=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, titulo);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
 
 
  public void deletarMusicaGenero(String titulo) {
        String sql = "delete from musica_genero where titulo=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, titulo);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
  public void deletarMusicaCantor(String titulo) {
        String sql = "delete from musica_cantor where titulo=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, titulo);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
  public void atualizarGenero(String g, Genero genero) {
        String sql = "update genero"
                + "set nome_genero=?"
                + "where nome_genero=?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, genero.getGenero());
            pstm.setString(2, g);
           // pstm.setString(3, musica.getGenero());
           // pstm.setString(4, musica.getPlaylist().getNomePlaylist());
          
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
  public void deletarPlaylistMusica(String titulo) {
        String sql ="delete from playlist_musica where titulo=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, titulo);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
 public void atualizarMusica(String titulo, Musica musica) {
        String sql = "update musica "
                + "set titulo=?, arquivo=? "
                + "where titulo=?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, musica.getTitulo());
            pstm.setString(2, musica.getArquivo());
           // pstm.setString(3, musica.getGenero());
           // pstm.setString(4, musica.getPlaylist().getNomePlaylist());
           pstm.setString(3, titulo);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
 
  public void atualizarCantor(String nome, Cantor cantor) {
        String sql = "update cantor"
                + "set nome=?"
                + "where nome=?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cantor.getNome());
            pstm.setString(2, nome);
           // pstm.setString(3, musica.getGenero());
           // pstm.setString(4, musica.getPlaylist().getNomePlaylist());
          
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
 
    public Cantor adicionarCantor(Cantor cantor){
        Connection conn = null;
        PreparedStatement pstm = null;
        String sql = "insert "
                + "into cantor(nome)"
                + " values(?)";

        try {
            
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, cantor.getNome());
            //pstm.setString(3, musica.getGenero());
            //pstm.setString(4, musica.getPlaylist().getNomePlaylist());  
            
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    
   
    
    public Cantor buscarCantor(String nome) {
        
        String sql = "select * from cantor"
                + " where nome=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;

        try {
            
            conn = ConnectionFactory.getConexao();
            
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, nome);
            
            rset = pstm.executeQuery();

            Cantor cantor = new Cantor(null);
            
            while (rset.next()) {
               
                //Playlist playlist = new Playlist(null);
                cantor.setNome(rset.getString("nome"));
              //  musica.setGenero(rset.getString("genero"));
                
                return cantor;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public ArrayList<Musica> buscarMusicaPorCantor(String nome) {
        
        String sql = "select * from musica_cantor"
                + " where nome=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
        musicas.clear();
        try {
            
            conn = ConnectionFactory.getConexao();
            
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, nome);
            
            rset = pstm.executeQuery();

           
            
            while (rset.next()) {
                Musica musica = new Musica(null);
                //Playlist playlist = new Playlist(null);
                musica.setTitulo(rset.getString("titulo"));
                musica.setArquivo(buscarMusicaPorTitulo(musica.getTitulo()).getArquivo());
                
                musicas.add(musica);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return musicas ;
    }
    
    public ArrayList<Musica> buscarMusicaPorGenero(String genero) {
        
        String sql = "select * from musica_genero"
                + " where nome_genero=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        musicas.clear();
        ResultSet rset = null;

        try {
            
            conn = ConnectionFactory.getConexao();
            
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, genero);
            
            rset = pstm.executeQuery();

            
            
            while (rset.next()) {
               Musica musica = new Musica(null);
                //Playlist playlist = new Playlist(null);
                musica.setTitulo(rset.getString("titulo"));
                musica.setArquivo(buscarMusicaPorTitulo(musica.getTitulo()).getArquivo());
                
                musicas.add(musica);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return musicas;
    }
    
    public void deletarCantor(String nome) {
        String sql = "delete from musica where nome=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nome);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    
    public void vincularMusicaCantor(Musica musica, Cantor cantor){
         Connection conn = null;
        PreparedStatement pstm = null;
        String sql = "insert "
                + "into musica_cantor(titulo, nome)"
                + " values(?, ?)";

        try {
            
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, musica.getTitulo());
            pstm.setString(2, cantor.getNome());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    
    
    public void vincularMusicaGenero(Musica musica, Genero genero){
         Connection conn = null;
        PreparedStatement pstm = null;
        String sql = "insert "
                + "into musica_genero(titulo, nome_genero)"
                + " values(?, ?)";

        try {
            
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, musica.getTitulo());
            pstm.setString(2, genero.getGenero());
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
    public Genero adicionarGenero(Genero genero){
        Connection conn = null;
        PreparedStatement pstm = null;
        String sql = "insert "
                + "into genero(nome_genero)"
                + " values(?)";

        try {
            
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, genero.getGenero());
            
            pstm.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
   
    
    public Genero buscarGenero(String genero) {
        
        String sql = "select * from genero"
                + " where nome_genero=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;

        try {
            
            conn = ConnectionFactory.getConexao();
            
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, genero);
            
            rset = pstm.executeQuery();

            Genero generoObj = new Genero(null);
            
            while (rset.next()) {
               
                Playlist playlist = new Playlist(null);
                generoObj.setGenero(rset.getString("nome_genero"));
              //  musica.setGenero(rset.getString("genero"));
                
                return generoObj;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    public void deletarGenero(String genero) {
        String sql = "delete from genero where nome_genero=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, genero);
            pstm.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public Cantor buscarCantorPorMusica(String titulo) {
        
        String sql = "select * from musica_cantor"
                + " where titulo=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;

        try {
            
            conn = ConnectionFactory.getConexao();
            
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, titulo);
            
            rset = pstm.executeQuery();

            Cantor cantor = new Cantor(null);
            
            while (rset.next()) {
               
                Playlist playlist = new Playlist(null);
                cantor.setNome(rset.getString("nome"));
              //  musica.setGenero(rset.getString("genero"));
                
                return cantor;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
    public Genero buscarGeneroPorMusica(String titulo) {
        
        String sql = "select * from musica_genero"
                + " where titulo=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;

        try {
            
            conn = ConnectionFactory.getConexao();
            
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, titulo);
            
            rset = pstm.executeQuery();

            Genero genero = new Genero(null);
            
            while (rset.next()) {
               
                Playlist playlist = new Playlist(null);
                genero.setGenero(rset.getString("nome_genero"));
              //  musica.setGenero(rset.getString("genero"));
                
                return genero;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    
      public ArrayList<Musica> array() {
        
      
//ArrayList<Musica> musicas = new ArrayList<Musica>();
String sql = "select * from musica" ;
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
itens.clear();
        try {
            
            conn = ConnectionFactory.getConexao();
            
            pstm = conn.prepareStatement(sql);
           
           // pstm.setString(1, titulo);
            
            rset = pstm.executeQuery();

           
            
            while (rset.next()) {
               
                Musica musica = new Musica(null);
                musica.setTitulo(rset.getString("titulo"));
                musica.setArquivo(rset.getString("arquivo"));
                
                itens.add(musica);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
}
         return itens;
      }
      public ArrayList<Musica> mostrarMusicas(String nomePlaylist) {
        
        String sql = "select * from playlist_musica"
                + " where nome_playlist=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
       musicas.clear();

        try {
            
            conn = ConnectionFactory.getConexao();
            
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, nomePlaylist);
            
            rset = pstm.executeQuery();
          
             while (rset.next()) {
                Musica musica = new Musica(null);
               musica.setTitulo(rset.getString("titulo"));
                String arquivo = buscarMusicaPorTitulo(rset.getString("titulo")).getArquivo();
                musica.setArquivo(arquivo);
               
              //  musica.setGenero(rset.getString("genero"));
                
               musicas.add(musica);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            
            try {
                if (rset != null) {
                    rset.close();
                }
                if (pstm != null) {
                    pstm.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return musicas;
    }
}
