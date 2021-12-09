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

//import com.playlist.model.BasePlaylist;
//import com.playlist.model.Cantor;
//import com.playlist.model.Genero;
import com.playlist.model.Musica;
import com.playlist.model.Playlist;
import com.playlist.util.ConnectionFactory;
import com.playlist.util.NegocioException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.ArrayList;

/**
 *
 * @author Amanda
 */
public class PlaylistDAO {
    ArrayList<Playlist> playlists = new ArrayList<>();
      ArrayList<BasePlaylist> itens = new ArrayList<>();
   
      
    public void criarPlaylist(Playlist playlist) {
        Connection conn = null;
        PreparedStatement pstm = null;

        String sql = "insert into playlist(nome_playlist)"
                + "values (?)";
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, playlist.getNomePlaylist());
            pstm.execute();
        } catch (SQLException e) {
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

    public Playlist buscarPorNome(String nomePlaylist) throws NegocioException{
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
        String sql = "select * from playlist "
                + "where Nome_Playlist=?";
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nomePlaylist);
            rset = pstm.executeQuery();
            Playlist playlist = new Playlist(null);
            while (rset.next()) {
                playlist.setNomePlaylist(rset.getString("Nome_Playlist"));
                return playlist;
            }
        } catch (SQLException e) {
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
    
    public void vincularMusicaPlaylist(Musica musica, Playlist playlist){
         Connection conn = null;
        PreparedStatement pstm = null;
        String sql = "insert "
                + "into playlist_musica(titulo, nome_playlist)"
                + " values(?, ?)";

        try {
            
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
           
            pstm.setString(1, musica.getTitulo());
            pstm.setString(2, playlist.getNomePlaylist());
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
    
    public void removerMusicaDaPlaylist(String titulo, String nomePlaylist) {
        String sql = "delete from playlist_musica where titulo=? and nome_playlist=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, titulo);
            pstm.setString(2, nomePlaylist);
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

    public void deletarPlaylistMusica(String nomePlaylist) {
        String sql ="delete from playlist_musica where nome_playlist=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nomePlaylist);
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
    
    public void deletarPlaylist(String nomePlaylist) {
        String sql = "delete from playlist where nome_playlist=?";
        Connection conn = null;
        PreparedStatement pstm = null;
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nomePlaylist);
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
    
 public ArrayList<Playlist> arrayPlaylists() {
        
      
String sql = "select * from playlist" ;
        Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
playlists.clear();
        try {
            
            conn = ConnectionFactory.getConexao();
            
            pstm = conn.prepareStatement(sql);
           
           // pstm.setString(1, titulo);
            
            rset = pstm.executeQuery();

           
            
            while (rset.next()) {
               
                Playlist playlist = new Playlist(null);
                playlist.setNomePlaylist(rset.getString("nome_playlist"));
                
                
                playlists.add(playlist);
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
         return playlists;
      }
    public void atualizarPlaylist(String nomePlaylist, Playlist playlist) {
        String sql = "update playlist " +"set nome_playlist=? "
                + "where nome_playlist=?";
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, playlist.getNomePlaylist());
            
           pstm.setString(2, nomePlaylist);
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
    public void atualizar(String nomePlaylist, Playlist playlist) {
        String sql = "update playlist set nome_playlist=?"
                + "where nome_playlist=?";
         Connection conn = null;
        PreparedStatement pstm = null;
        
        ResultSet rset = null;
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, playlist.getNomePlaylist());
              pstm.setString(2, nomePlaylist);
           
            pstm.execute();
        } catch (SQLException e) {
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
    
     
   /* public Playlist buscarPorNome(String nomePlaylist) {
        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet rset = null;
       
        try {
            conn = ConnectionFactory.getConexao();
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, nomePlaylist);
            
            rset = pstm.executeQuery();
            Playlist playlist = new Playlist();
            while (rset.next()) {
                turma.setId(rset.getInt("id_turma"));
                turma.setAno(rset.getInt("ano_turma"));
                turma.setCurso(rset.getString("curso_turma"));
                return turma;
            }
        } catch (SQLException e) {
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
    */
}
