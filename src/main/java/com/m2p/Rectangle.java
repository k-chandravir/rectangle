package com.m2p;

//class NegativeSideException extends Exception{
//    public NegativeSideException(int anySideOfRectangle){
//        super(anySideOfRectangle);
//    }
//}
public class Rectangle {
    private final int lengthOfRectangle;
    private final int breadthOfRectangle;

    public Rectangle(int lengthOfRectangle, int breadthOfRectangle){
        this.lengthOfRectangle = lengthOfRectangle;
        this.breadthOfRectangle = breadthOfRectangle;
    }

    public static Rectangle createSquare(int sideOfSquare){
        return new Rectangle(sideOfSquare, sideOfSquare);
    }
    public int area() {
        if(lengthOfRectangle < 0 || breadthOfRectangle < 0){
            throw new IllegalArgumentException();
        }
        return lengthOfRectangle * breadthOfRectangle;
    }

    public int perimeter() {
        if(lengthOfRectangle < 0 || breadthOfRectangle < 0){
            throw new IllegalArgumentException();
        }
        return 2 * (lengthOfRectangle + breadthOfRectangle);
    }
}
