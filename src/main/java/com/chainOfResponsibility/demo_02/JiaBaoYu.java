package com.chainOfResponsibility.demo_02;

public class JiaBaoYu extends Player{

    public JiaBaoYu(Player successor){
        this.setSuccessor(successor);
    }

    @Override
    public void handle(int i) {
        if (i == 4){
            System.out.println("Jia Bao Yu gotta drink!");
        }else {
            System.out.println("Jia Bao Yu passed!");
            next(i);
        }
    }
}
