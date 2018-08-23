package com.chainOfResponsibility.demo_01;

public abstract class Handler {

    /**
     * 处理方法
     */
    protected Handler successor;
    public abstract void handleRequest();

    /**
     * 赋值方法
     */
    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
