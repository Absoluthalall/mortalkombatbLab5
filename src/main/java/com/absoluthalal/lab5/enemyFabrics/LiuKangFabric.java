package com.absoluthalal.lab5.enemyFabrics;

import com.absoluthalal.lab5.enemies.LiuKang;
import com.absoluthalal.lab5.player.Player;


public class LiuKangFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new LiuKang(1, 70, 20, 1);
        return enemy;
    }
}
