package com.absoluthalal.lab5.enemies;

import com.absoluthalal.lab5.player.Player;
import javax.swing.ImageIcon;


public class Baraka extends Player{
    
    
    public Baraka(int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
        picture = new ImageIcon(this.getClass().getResource("/Baraka.jpg"));
    }
    
    @Override
    public String getName(){
        return "Baraka";
    }
    
   
    
}
