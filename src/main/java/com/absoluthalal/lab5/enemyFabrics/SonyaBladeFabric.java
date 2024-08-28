package com.absoluthalal.lab5.enemyFabrics;

import com.absoluthalal.lab5.enemies.SonyaBlade;
import com.absoluthalal.lab5.player.Player;



public class SonyaBladeFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new SonyaBlade(1, 80, 16, 1);
        return enemy;
    }

}
