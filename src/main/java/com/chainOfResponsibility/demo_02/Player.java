package com.chainOfResponsibility.demo_02;

public abstract class Player {

    abstract public void handle(int i);
    private Player successor;

    public Player(){
        successor = null;
    }

    public void setSuccessor(Player successor) {
        this.successor = successor;
    }

    public void next(int index){
        if(null != successor){
            successor.handle(index);
        }else {
            System.out.println("Program terminated.");
            System.exit(0);
        }

    }
}
