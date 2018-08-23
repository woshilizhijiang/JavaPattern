package com.adapter.objInstance;

import java.util.Observable;
import java.util.Observer;

public class ObserverClient {

    public static void main(String[] args){

        //主题 被观察者
        Observable subject = new SubObservable();
        //观察者
        Observer observer = new ConcreteObserverString();
        subject.addObserver(observer);
        subject.notifyObservers();

    }

}
