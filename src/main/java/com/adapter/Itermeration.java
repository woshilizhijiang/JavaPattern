package com.adapter;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * 对象的适配模式
 */
public class Itermeration implements Enumeration {

    private Iterator it;

    public Itermeration(Iterator it){
        this.it = it;
    }

    @Override
    public boolean hasMoreElements() {
        return it.hasNext();
    }

    @Override
    public Object nextElement() {
        return it.next();
    }
}
