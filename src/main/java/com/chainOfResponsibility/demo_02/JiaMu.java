package com.chainOfResponsibility.demo_02;

public class JiaMu extends Player{

    public JiaMu(Player successor){
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 1){
            System.out.println("Jia Mu gotta drink!");
        }else {
            System.out.println("Jia Mu passed!");
            next(i);
        }
    }
}
