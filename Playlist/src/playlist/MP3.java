/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playlist;

/**
 *
 * @author Amanda
 */

import com.playlist.model.Playlist;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.Map;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackEvent;
import javazoom.jl.player.advanced.PlaybackListener;


public class MP3 extends Thread {
  /**
   * Objeto para nosso arquivo MP3 a ser tocado
   */
    
  private File mp3;
  /**
   * Objeto Player da biblioteca jLayer. Ele tocará o arquivo
   * MP3
   */
  private AdvancedPlayer player;
//Player player;
  /**
   * Construtor que recebe o objeto File referenciando o arquivo
   * MP3 a ser tocado e atribui ao atributo MP3 da classe.
   *
   * @param mp3
   * 
   */
  
 boolean paused;

  public MP3(File mp3) {
    this.mp3 = mp3;
  }
  /**
   * Método que toca o MP3
   */ 
 public void run() {
   
      
         try {
                    FileInputStream fis     = new FileInputStream(mp3);
                BufferedInputStream bis = new BufferedInputStream(fis);
               
                this.player = new AdvancedPlayer(bis);
                System.out.println("Tocando!");
                this.player.play();
                System.out.println("Terminado!");
                  
                  //while(paused){ 
                //this.stop();
               // System.out.println("Terminado!");
                 // }
     } catch (Exception e) {
                System.out.println("Problema ao tocar " + mp3);
                e.printStackTrace();
            }
         
     }
 
 public void teste(){
     if(!paused){
         
     }
 }
 
 public void play(){
     new Thread() {
			
			@Override
			public void run() {
				try {
                    FileInputStream fis     = new FileInputStream(mp3);
                BufferedInputStream bis = new BufferedInputStream(fis);
               
                AdvancedPlayer player = new AdvancedPlayer(bis);
                System.out.println("Tocando!");
                player.play();
                Thread.currentThread().interrupt();
                System.out.println("Terminado!");
                  
                 
                
                  //while(paused){ 
                //this.stop();
               // System.out.println("Terminado!");
                 // }
     } catch (Exception e) {
                System.out.println("Problema ao tocar " + mp3);
                e.printStackTrace();
            }
			}
		}.start();

 }
     public void pausee(){
           new Thread() {
			
			@Override
			public void run() {
				try {
                    FileInputStream fis     = new FileInputStream(mp3);
                BufferedInputStream bis = new BufferedInputStream(fis);
               
                AdvancedPlayer player = new AdvancedPlayer(bis);
                System.out.println("Tocando!");
                player.close();
                System.out.println("Terminado!");
                  
               
                
                  //while(paused){ 
                //this.stop();
               // System.out.println("Terminado!");
                 // }
     } catch (Exception e) {
                System.out.println("Problema ao tocar " + mp3);
                e.printStackTrace();
            }
			}
		}.start();
     }
 public void pause(){
     while(paused)new Thread(
            new Runnable(){
                public void run(){
                    try{
                         System.out.println("Terminado!");
                        player.close();
                    }catch(Exception e){
                        JOptionPane.showMessageDialog(null, "Error stoping mp3 file");
                        paused = false;
                    }
                }
            }
    ).start();
 }
 

public void userPressedPause() {
 paused = true;
}
 
public void userPressedPlay() {
 
  paused = false;
 
}




}
    

