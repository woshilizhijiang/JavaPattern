package com.adapter.objInstance;

import java.util.Observable;

public class SubObservable extends Observable{
    public SubObservable(){
        super.setChanged();
    }
}
