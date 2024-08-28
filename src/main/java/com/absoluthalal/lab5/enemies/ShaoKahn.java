package com.absoluthalal.lab5.enemies;

import com.absoluthalal.lab5.player.Player;
import javax.swing.ImageIcon;


public class ShaoKahn extends Player{
    
    public ShaoKahn(int level, int health, int  damage, int attack){
        super (level, health, damage, attack);
        picture = new ImageIcon(this.getClass().getResource("/ShaoKahn.jpg"));
    }
    
    @Override
    public String getName(){
        return "Shao Kahn";
    }
}
