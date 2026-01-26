package com.github.pamanne.exercises.javase009;

public class Shape {
    protected String color;
    protected boolean isFilled;

    public Shape(String color, boolean isFilled){
        this.color =color;
        isFilled = true;

    }

    public double getArea(){
        return 0;
    }
    
    public double getPerimeter(){
        return 0;
    }

    public String toString(){
        return color+"shape"+ "is filled = " + isFilled;
    }
    

}
