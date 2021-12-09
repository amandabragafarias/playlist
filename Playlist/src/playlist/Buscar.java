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
import com.playlist.util.NegocioException;
import java.awt.Color;

import java.io.File;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javazoom.jl.player.Player;

/**
 *
 * @author Amanda
 */
public class Buscar extends javax.swing.JFrame {
MusicaController mController = new MusicaController();
        PlaylistController pController = new PlaylistController();
        private Player player;
       
         
    
        
        private void preencherJtable() throws NegocioException {
        //Aqui carrego minha lista
        ArrayList<Musica> itens = mController.array();
         DefaultTableModel tableMusicas = (DefaultTableModel) jTMusicas.getModel();

        
              //Aqui verifico se a jTable tem algum registo se tiver eu deleto
        while (tableMusicas.getRowCount() > 0) {
            tableMusicas.removeRow(0);
        }

                 //Aqui eu adiciono cada linha da lista na jTable
        for (Musica m : itens) {
                      Genero genero = mController.buscarGeneroPorMusica(m.getTitulo());
                      Cantor cantor = mController.buscarCantorPorMusica(m.getTitulo());
            tableMusicas.addRow(new Object[] { 
                    m.getTitulo(),
                    cantor.getNome(),
                    genero.getGenero(),
                    m.getArquivo()
            
            });
        }
    }
    /**
     * Creates new form Buscar
     */
    public Buscar() throws NegocioException {
        initComponents();
      preencherJtable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jTextTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextCantor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextGenero = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTMusicas = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPlay = new javax.swing.JButton();
        jPause = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem9.setText("jMenuItem9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Titulo:");

        jTextTitulo.setForeground(new java.awt.Color(153, 153, 153));
        jTextTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextTitulo.setText("buscar por titulo");
        jTextTitulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextTituloMousePressed(evt);
            }
        });
        jTextTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTituloActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantor:");

        jLabel3.setText("Gênero:");

        jTextCantor.setForeground(new java.awt.Color(153, 153, 153));
        jTextCantor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextCantor.setText("buscar  cantor");
        jTextCantor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextCantorMousePressed(evt);
            }
        });
        jTextCantor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCantorActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-148820_640.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-148820_640.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextGenero.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        jTextGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Axé", "Black Music", "Blues", "Bossa Nova", "Chillout", "Classic Rock", "Clássico", "Country", "Dance", "Disco", "Electro Swing", "Electronica", "Emocore", "Fado", "Folk", "Forró", "Funk", "Funk Carioca", "Gospel/Religioso", "Gótico", "Grunge", "Hard Rock", "Hardcore", "Heavy Metal", "Hip Hop", "House", "Indie", "Industrial", "Infantil", "Instrumental", "J-Pop/J-Rock", "Jazz", "Jovem Guarda", "K-Pop/K-Rock", "Kizomba", "Metal", "MPB", "Músicas Gaúchas", "New Age", "New Wave", "Pagode", "Piano Rock", "Pop", "Pop/Punk", "Pop/Rock", "Pós-Punk", "Post-Rock", "Power-Pop", "Progressivo", "Psicodelia", "Punk Rock", "R&B", "Rap", "Reggae", "Reggaeton", "Regional", "Rock", "Rock Alternativo", "Rockabilly", "Romântico", "Samba", "Samba Enredo", "Sertanejo", "Ska", "Soft Rock", "Soul Music", "Surf Music", "Tecnopop", "Trance", "Trilha Sonora", "Trip-Hop", "Tropical House", "Velha Guarda", "World Music", "" }));
        jTextGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextGeneroActionPerformed(evt);
            }
        });

        jTMusicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Cantor", "Gênero", "Arquivo"
            }
        ));
        jScrollPane2.setViewportView(jTMusicas);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/x.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/file_edit.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/playy.png"))); // NOI18N
        jPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlayActionPerformed(evt);
            }
        });

        jPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/stop.png"))); // NOI18N
        jPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPauseActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/static.gif"))); // NOI18N

        jButton5.setText("Mostrar todas");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Adicionar a Playlist");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-148820_640.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/msu.png"))); // NOI18N
        jMenu1.setText("Músicas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/music-player (1).png"))); // NOI18N
        jMenuItem1.setText("Adicionar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/music-player (2).png"))); // NOI18N
        jMenuItem2.setText("Atualizar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/playlists.png"))); // NOI18N
        jMenu7.setText("Playlists");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/criar.png"))); // NOI18N
        jMenuItem3.setText("Adicionar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem3);

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/music-player (1).png"))); // NOI18N
        jMenuItem5.setText("Adicionar música");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/atualizar.png"))); // NOI18N
        jMenuItem6.setText("Atualizar");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/buscar.png"))); // NOI18N
        jMenuItem7.setText("Buscar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/apagar.png"))); // NOI18N
        jMenuItem8.setText("Deletar");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem8);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/music-player (4).png"))); // NOI18N
        jMenuItem10.setText("Remover música");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem10);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPause, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jTextCantor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextCantor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jTextGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton5))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPause, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextTituloMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextTituloMousePressed
        jTextTitulo.setEditable(true);
        jTextTitulo.setText("");
        jTextTitulo.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTituloMousePressed

    private void jTextCantorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextCantorMousePressed
        jTextCantor.setEditable(true);
        jTextCantor.setText("");
        jTextCantor.setForeground(Color.BLACK);        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantorMousePressed

    private void jTextTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTituloActionPerformed

    private void jTextCantorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCantorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCantorActionPerformed

    private void jTextGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextGeneroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel tableMusicas = (DefaultTableModel) jTMusicas.getModel();
           try {
            Musica musica = mController.buscarMusicaPorTitulo(jTextTitulo.getText());
            Cantor cantor = mController.buscarCantorPorMusica(jTextTitulo.getText());
            Genero genero = mController.buscarGeneroPorMusica(jTextTitulo.getText());
             while (tableMusicas.getRowCount() > 0) {
            tableMusicas.removeRow(0);
        }
            
            tableMusicas.addRow(new Object[]{
                        musica.getTitulo(),
                        cantor.getNome(),
                        genero.getGenero(),
                       musica.getArquivo()

                    });
        }catch (NegocioException ex) {
      JOptionPane.showMessageDialog(this, "Música não encontrada");
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel tableMusicas = (DefaultTableModel) jTMusicas.getModel();
           try {
            while (tableMusicas.getRowCount() > 0) {
            tableMusicas.removeRow(0);
        }
           
            ArrayList<Musica> musicas = mController.buscarMusicaPorCantor(jTextCantor.getText());
            //Musica marq = mController.buscarMusicaPorTitulo(musica.getTitulo());
           
             for (Musica m : musicas) {
                      Genero genero = mController.buscarGeneroPorMusica(m.getTitulo());
                      Cantor cantor = mController.buscarCantorPorMusica(m.getTitulo());
            tableMusicas.addRow(new Object[] { 
                    m.getTitulo(),
                    cantor.getNome(),
                    genero.getGenero(),
                    m.getArquivo()
            
            });
        }
        }catch (NegocioException ex) {
      JOptionPane.showMessageDialog(this, "Nenhuma música encontrada.");
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel tableMusicas = (DefaultTableModel) jTMusicas.getModel();
         
         if(jTMusicas.getSelectedRow() != -1){
             try{    
                 mController.deletarMusicaCantor(jTMusicas.getValueAt(jTMusicas.getSelectedRow(), 0).toString());
                 mController.deletarMusicaGenero(jTMusicas.getValueAt(jTMusicas.getSelectedRow(), 0).toString());
                 mController.deletarMusicaPorTitulo(jTMusicas.getValueAt(jTMusicas.getSelectedRow(), 0).toString());
                 tableMusicas.removeRow(jTMusicas.getSelectedRow());
            JOptionPane.showMessageDialog(this, "DELETADA");
             }catch (NegocioException ex) {
      JOptionPane.showMessageDialog(this, "Erro ao deletar música");
    }
         }else{
             JOptionPane.showMessageDialog(this, "Selecione um item");
         }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
          new AtualizarMusica().setVisible(true);
        this.dispose();
         
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        new AdicionarMusica().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    MP3 pr;
    private void jPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlayActionPerformed
       
         DefaultTableModel tableMusicas = (DefaultTableModel) jTMusicas.getModel();
         
         if(jTMusicas.getSelectedRow() != -1){
             try {
         Musica musica = mController.buscarMusicaPorTitulo(jTMusicas.getValueAt(jTMusicas.getSelectedRow(), 0).toString());
           String path = musica.getArquivo();
    //Instanciação de um objeto File com o arquivo MP3
    File mp3File = new File(path);
    //Instanciação do Objeto MP3, a qual criamos a classe.
    pr = new MP3(mp3File);
    pr.userPressedPause();
    pr.start();
    
    jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/eqgif.gif")));
    
   // new Buscar1().setVisible(true);
        
    jPlay.setEnabled(false);
    jPause.setEnabled(true);
    
    } catch (NegocioException ex) {
        
      JOptionPane.showMessageDialog(this, "Erro ao reproduzir música");
    }        
         }else{
             JOptionPane.showMessageDialog(this, "Selecione um item");
         }
           //}
//};
        //jPlay.addActionListener(meuActionListener);
        //jPause.addActionListener(meuActionListener);
        
    }//GEN-LAST:event_jPlayActionPerformed

    private void jPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPauseActionPerformed
       
     
       
 pr.userPressedPause();
    pr.stop();
    jPlay.setEnabled(true);
    jPause.setEnabled(false);
   jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/static.gif")));
         
         
    
    
    }//GEN-LAST:event_jPauseActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
    new AtualizarPlaylist().setVisible(true);
      
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
    
        new DeletarPlaylist().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new CriarPlaylist().setVisible(true);
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
    try {
        // TODO add your handling code here:
        new AdcMusica().setVisible(true);
    } catch (NegocioException ex) {
        Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.dispose();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
    try {
        new Playlists().setVisible(true);
    } catch (NegocioException ex) {
        Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
    try {
        new AdcMusica().setVisible(true);
    } catch (NegocioException ex) {
        Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
    
        new AtualizarMusica().setVisible(true);
    
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    try {
        // TODO add your handling code here:
        preencherJtable();
    } catch (NegocioException ex) {
        Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try {
        // TODO add your handling code here:
        new AdcMusica().setVisible(true);
    } catch (NegocioException ex) {
        Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
    }
    
        this.dispose();
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
          DefaultTableModel tableMusicas = (DefaultTableModel) jTMusicas.getModel();
           try {
            while (tableMusicas.getRowCount() > 0) {
            tableMusicas.removeRow(0);
        }
           
            ArrayList<Musica> musicas = mController.buscarMusicaPorGenero((String) jTextGenero.getSelectedItem());
            //Musica marq = mController.buscarMusicaPorTitulo(musica.getTitulo());
           
             for (Musica m : musicas) {
                      Genero genero = mController.buscarGeneroPorMusica(m.getTitulo());
                      Cantor cantor = mController.buscarCantorPorMusica(m.getTitulo());
            tableMusicas.addRow(new Object[] { 
                    m.getTitulo(),
                    cantor.getNome(),
                    genero.getGenero(),
                    m.getArquivo()
            
            });
        }
        }catch (NegocioException ex) {
      JOptionPane.showMessageDialog(this, "Nenhuma música encontrada.");
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Buscar().setVisible(true);
                } catch (NegocioException ex) {
                    Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JButton jPause;
    private javax.swing.JButton jPlay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTMusicas;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCantor;
    private javax.swing.JComboBox jTextGenero;
    private javax.swing.JTextField jTextTitulo;
    // End of variables declaration//GEN-END:variables
}
