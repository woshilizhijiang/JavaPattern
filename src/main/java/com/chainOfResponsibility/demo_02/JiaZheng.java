package com.chainOfResponsibility.demo_02;

public class JiaZheng extends Player{

    public JiaZheng(Player successor){
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 3){
            System.out.println("Jia Zheng gotta drink!");
        }else {
            System.out.println("Jia Zheng passed!");
            next(i);
        }
    }
}
