package com.github.pamanne.exercises.javase018;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();

        myStack.pushItem(4);
        myStack.pushItem(5);
        myStack.pushItem(6);
        myStack.pushItem(7);
        
        myStack.popItem();
        myStack.peekItem();


        myStack.printStack();
    

    }

}
