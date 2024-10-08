package com.absoluthalal.lab5.enemies;

import com.absoluthalal.lab5.player.Player;
import javax.swing.ImageIcon;


public class SubZero extends Player{
    
    public SubZero(int level, int health, int damage , int attack){
        super (level, health, damage, attack);
        picture = new ImageIcon(this.getClass().getResource("/SubZero.png"));
    }
    
    @Override
    public String getName(){
        return "Sub-Zero";
    }
    
    @Override
     public Boolean isWizard() {
         return true;
     }
}
