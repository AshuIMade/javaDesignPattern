package com.desgnPatterns.others.generics;

public class GenericsBounded<T extends Number> {
    private T[] nums;

    public GenericsBounded(T[] nums){
        this.nums = nums;
    }

    public T[] getNums(){
        return nums;
    }

    public double average(){
        double sum = 0.0;
        for (Number number:nums){
            sum += number.doubleValue();
        }
        return sum/ nums.length;
    }
    //public boolean sameAvg(GenericsBounded<T> gb){
      //  return average() == gb.average();
    //}
}
