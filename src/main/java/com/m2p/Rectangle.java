package com.m2p;

//class NegativeSideException extends Exception{
//    public NegativeSideException(int anySideOfRectangle){
//        super(anySideOfRectangle);
//    }
//}
public class Rectangle {
    public int area(int lengthOfRectangle, int breadthOfRectangle) {
        if(lengthOfRectangle < 0 || breadthOfRectangle < 0){
            throw new IllegalArgumentException();
        }
        return lengthOfRectangle * breadthOfRectangle;
    }
}
