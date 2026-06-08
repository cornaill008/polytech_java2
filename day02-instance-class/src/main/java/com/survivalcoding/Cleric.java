package com.survivalcoding;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Cleric {
    String name;
    int hp;
    int mp;

    // MP를 5 소비하고 HP를 최대 50까지 회복한다.
    void selfAid() {
        if (mp - 5 > 0) {
            mp -= 5;
            hp = Math.min(hp + 50, 50);
        }
    }

    // 기도한 시간에 0~2의 랜덤 보정을 더해 MP를 회복한다.
    int pray(int seconds) {
        int beforeMp = mp;
        int rec = seconds + new Random().nextInt(3);

        mp = Math.min(mp + rec, 10);

        return mp - beforeMp;
    }

    void attack() {
        hp--;
    }
}


//