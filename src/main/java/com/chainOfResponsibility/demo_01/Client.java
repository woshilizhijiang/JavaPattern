package com.chainOfResponsibility.demo_01;

public class Client {

    static private Handler handler1,handler2,handler3;

    public static void main(String[] args){
        handler1 = new ConcreteHandler();
        handler2 = new ConcreteHandler();
        handler3 = new ConcreteHandler();

        handler1.setSuccessor(handler2);
//        handler2.setSuccessor(handler3);

        handler1.handleRequest();
    }

}
