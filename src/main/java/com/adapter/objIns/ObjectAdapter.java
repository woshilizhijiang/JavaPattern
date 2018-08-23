package com.adapter.objIns;

public class ObjectAdapter implements ObjectTarget {

    private ObjectAdaptee adaptee;

    public ObjectAdapter(ObjectAdaptee adaptee){
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperator1() {
        adaptee.sampleOperator1();
    }

    @Override
    public void sampleOperator2() {

    }
}
