/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafica;

import Logica.hilo;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JFrame;

import org.jfugue.player.Player;

/**
 *
 * @author andre
 */
public class PianoGraf extends javax.swing.JFrame implements KeyListener {

    int tonalidad = 0;
    Timer reloj = new Timer();

    Player player = new Player();

    public PianoGraf() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setLabel("Inicio");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        text.setEditable(false);
        text.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(text, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.addKeyListener(this);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PianoGraf().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        //DO
        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                if (key == KeyEvent.VK_A) {

                    hilo a = new hilo(player, "C" + tonalidad + "/.3");
                    a.start();
                    text.setText("Do" + tonalidad);
                }

        //DO#
                if (key == KeyEvent.VK_W) {

                    hilo a = new hilo(player, "C#" + tonalidad + "/.2");
                    a.start();
                    text.setText("Do#" + tonalidad);
                }

        //DO"
                if (key == KeyEvent.VK_K) {

                    hilo a = new hilo(player, "C" + (tonalidad + 1) + "/.3");
                    a.start();
                    text.setText("Do''" + tonalidad);

                }

                //RE
                if (key == KeyEvent.VK_S) {

                    hilo a = new hilo(player, "D" + tonalidad + "/.3");
                    a.start();
                    text.setText("Re" + tonalidad);

                }
                //RE#
                if (key == KeyEvent.VK_E) {

                    hilo a = new hilo(player, "D#" + tonalidad + "/.3");
                    a.start();
                    text.setText("Re#" + tonalidad);

                }
                //MI
                if (key == KeyEvent.VK_D) {
                    hilo a = new hilo(player, "E" + tonalidad + "/.3");
                    a.start();
                    text.setText("Mi" + tonalidad);
                }

                //FA
                if (key == KeyEvent.VK_F) {
                    hilo a = new hilo(player, "F" + tonalidad + "/.3");
                    a.start();
                    text.setText("FA" + tonalidad);
                }
                //FA#
                if (key == KeyEvent.VK_R) {

                    hilo a = new hilo(player, "F#" + tonalidad + "/.3");
                    a.start();
                    text.setText("Fa#" + tonalidad);
                }
                //SOL
                if (key == KeyEvent.VK_G) {

                    hilo a = new hilo(player, "G" + tonalidad + "/.3");
                    a.start();
                    text.setText("Sol" + tonalidad);

                }
                //SOL#
                if (key == KeyEvent.VK_T) {

                    hilo a = new hilo(player, "G#" + tonalidad + "/.3");
                    a.start();
                    text.setText("Sol#" + tonalidad);

                }
                //LA
                if (key == KeyEvent.VK_H) {

                    hilo a = new hilo(player, "A" + tonalidad + "/.3");
                    a.start();
                    text.setText("La" + tonalidad);

                }
                //LA#
                if (key == KeyEvent.VK_Y) {
                    hilo a = new hilo(player, "A#" + tonalidad + "/.3");
                    a.start();
                    text.setText("La#" + tonalidad);

                }
                //SI
                if (key == KeyEvent.VK_J) {

                    hilo a = new hilo(player, "B" + tonalidad + "/.3");
                    a.start();
                    text.setText("Si" + tonalidad);
                }
            }
        ;
        };
                
        reloj.schedule(tarea,100);

        if (key == KeyEvent.VK_NUMPAD0) {
            tonalidad = 0;
        }
        if (key == KeyEvent.VK_NUMPAD1) {
            tonalidad = 1;
        }
        if (key == KeyEvent.VK_NUMPAD2) {
            tonalidad = 2;
        }
        if (key == KeyEvent.VK_NUMPAD3) {
            tonalidad = 3;
        }
        if (key == KeyEvent.VK_NUMPAD4) {
            tonalidad = 4;
        }
        if (key == KeyEvent.VK_NUMPAD5) {
            tonalidad = 5;
        }
        if (key == KeyEvent.VK_NUMPAD6) {
            tonalidad = 6;
        }
        if (key == KeyEvent.VK_NUMPAD7) {
            tonalidad = 7;
        }
        if (key == KeyEvent.VK_NUMPAD8) {
            tonalidad = 8;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
