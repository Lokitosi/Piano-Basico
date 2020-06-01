/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import org.jfugue.player.Player;


public class hilo extends Thread {
    Player player;
    String nota;
    
    public hilo (Player player, String nota){
        this.player = player;
        this.nota = nota;
        
        
    }
    
    @Override
    public void run(){
        player.play(nota);
    }
    
}
