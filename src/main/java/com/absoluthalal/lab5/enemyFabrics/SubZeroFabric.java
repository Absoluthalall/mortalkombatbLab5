package com.absoluthalal.lab5.enemyFabrics;

import com.absoluthalal.lab5.enemies.SubZero;
import com.absoluthalal.lab5.player.Player;


public class SubZeroFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new SubZero(1, 60, 16, 1);
        return enemy;
    }

}
