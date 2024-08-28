package com.absoluthalal.lab5.enemyFabrics;

import com.absoluthalal.lab5.enemies.ShaoKahn;
import com.absoluthalal.lab5.player.Player;


public class ShaoKahnFabric implements EnemyFabricInterface{
    
    @Override
    public Player create(int i) {
        Player enemy;
        if(i==0){
            enemy = new ShaoKahn(3, 100, 30, 1);
        }
        else{
           enemy = new ShaoKahn(3, 145, 44, 1); 
        }
        return enemy;
    }
}
