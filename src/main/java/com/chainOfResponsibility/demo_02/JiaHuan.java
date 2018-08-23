package com.chainOfResponsibility.demo_02;

public class JiaHuan extends Player{

    public JiaHuan(Player successor){
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 5){
            System.out.println("Jia Huan gotta drink!");
        }else {
            System.out.println("Jia Huan passed!");
            next(i);
        }
    }
}
