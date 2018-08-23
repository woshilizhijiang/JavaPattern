package com.chainOfResponsibility.demo_02;

public class DrumBeater {

    public static void main(String[] args){
        Player player = new JiaMu(new JiaShe(new JiaZheng(new JiaBaoYu(new JiaHuan(null)))));
        player.handle(4);
    }
}
