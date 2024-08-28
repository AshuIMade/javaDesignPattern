package com.desgnPatterns.solid.ocp;

public interface ISpecification<T> {
    boolean isSatisfied(T item);
}
