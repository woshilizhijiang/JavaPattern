package com.adapter.objInstance;

import java.util.Observable;
import java.util.Observer;

public class ConcreteObserverString implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("client01");
    }
}
