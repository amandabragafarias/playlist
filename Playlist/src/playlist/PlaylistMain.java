/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;

import com.playlist.controller.MusicaController;
import com.playlist.controller.PlaylistController;
import com.playlist.model.Cantor;
import com.playlist.model.Genero;
import com.playlist.model.Musica;
import com.playlist.model.Playlist;
//import com.playlist.model.PlaylistMain;

import com.playlist.util.NegocioException;
import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Amanda
 */
public class PlaylistMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NegocioException {
        // TODO code application logic here
          Scanner ler = new Scanner(System.in);
//        Aluno aluno = new Aluno();
//        Turma turma = new Turma();

        /*MusicaController controller = new MusicaController();
        PlaylistController controle = new PlaylistController();
        String titulo;
       
            System.out.println("digite o titulo da musica");
             titulo = ler.next();
            System.out.println("digite o nome do cantor");
             String nomeCantor = ler.next();
             System.out.println("digite o genero");
             String genero = ler.next();
             System.out.println("digite o nome da playlist");
             String nomePlaylist = ler.next();
             
             PlaylistMain playlist = new PlaylistMain();
             playlist.setNomePlaylist(nomePlaylist);
             
             
             Musica musica = new Musica(String titulo, String nomeCantor, String genero,PlaylistMain playlist);
                    musica.setTitulo(titulo);
                    musica.setNomeCantor(nomeCantor);
                    musica.setGenero(genero);
                    musica.setPlaylist(playlist);
                                       }*/
                    
              //MusicaController mController = new MusicaController();
       /* PlaylistController pController = new PlaylistController();
      Playlist playlist = new Playlist(null);
        
            System.out.println("digite o nome da playlist");
            playlist.setNomePlaylist(ler.next());
           pController.criarPlaylist(playlist);
        System.out.println("playlist cadastrada.");
//            System.out.println("digite o nome");
//            aluno.setNome(ler.next());
//            System.out.println("digite o curso");
//            turma.setCurso(ler.next());
//            System.out.println("digite o ano de ingresso");
//            turma.setAno(ler.nextInt());
//            aluno.setTurma(turma);
     //    pController.criarPlaylist(playlist);
       // System.out.println("playlist cadastrada.");
        
        
            /*Playlist playlista=new Playlist(null);
             System.out.println("digite o nome da playlist que deseja buscar.");
              playlista.setNomePlaylist(ler.next());
             System.out.println(pController.buscarPorNome(playlista.getNomePlaylist()));
          */
       /* Musica musica = new Musica(null);
        System.out.println("digite o titulo");
        musica.setTitulo(ler.next());
        //Cantor cantor = new Cantor (null, null);
        System.out.println("digite o nome do cantor");
        cantor.setNome(ler.next());
        System.out.println("digite o codigo do cantor");
        cantor.setCodigo(ler.next());
        Genero genero = new Genero(null);
        System.out.println("digite o genero");
        genero.setGenero(ler.next());
        //musica.setPlaylist(playlist);
         mController.adicionarMusica(musica);
         mController.adicionarCantor(cantor);
         mController.adicionarGenero(genero);
         mController.vincularMusicaGenero(musica, genero);
        System.out.println("musica adicionada");*/
        
    
      String path = "C:\\Users\\Amand\\Desktop\\my musics\\The Chainsmokers - Closer (Lyric) ft. Halsey.mp3";
    //Instanciação de um objeto File com o arquivo MP3
    File mp3File = new File(path);
    //Instanciação do Objeto MP3, a qual criamos a classe.
    // 
    MP3 pr = new MP3(mp3File);
    int play = ler.nextInt();
    if(play==1){
  
    pr.start();
    play = ler.nextInt();}
if(play==2){
    pr.stop();
}}
}