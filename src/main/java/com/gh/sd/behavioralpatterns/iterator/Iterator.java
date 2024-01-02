package com.gh.sd.behavioralpatterns.iterator;

//Iterator interface allowing to iterate over
public interface Iterator<T> {

    boolean hasNext();

    T next();
}
