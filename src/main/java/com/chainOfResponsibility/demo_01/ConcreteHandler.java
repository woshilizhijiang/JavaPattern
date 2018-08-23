package com.chainOfResponsibility.demo_01;

public class ConcreteHandler extends Handler {

    @Override
    public void handleRequest() {
        if(null != getSuccessor()){
            System.out.println("The request is passed to" + getSuccessor());
            this.getSuccessor().handleRequest();
        }else {
            System.out.println("The request is handled here.");
        }
    }
}
