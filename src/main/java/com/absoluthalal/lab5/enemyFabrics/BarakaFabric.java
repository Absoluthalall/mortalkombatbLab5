package com.absoluthalal.lab5.enemyFabrics;

import com.absoluthalal.lab5.enemies.Baraka;
import com.absoluthalal.lab5.player.Player;



public class BarakaFabric implements EnemyFabricInterface {

    @Override
    public Player create(int i) {
        Player enemy;
        enemy = new Baraka(1, 100, 12, 1);
        return enemy;
    }
}
