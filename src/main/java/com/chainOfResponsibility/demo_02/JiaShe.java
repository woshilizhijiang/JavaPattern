package com.chainOfResponsibility.demo_02;

public class JiaShe extends Player{

    public JiaShe(Player successor){
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 2){
            System.out.println("Jia She gotta drink!");
        }else {
            System.out.println("Jia She passed!");
            next(i);
        }
    }
}