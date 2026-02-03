package com.github.pamanne.exercises.javase018;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private List<T> stackItems = new ArrayList<>();

    public void pushItem(T item) {
        stackItems.add(item);
        System.out.println("Added: " + item);

    }

    public void popItem() {
        T removeItem = stackItems.remove(stackItems.size() - 1);
        System.out.println("Removed: " + removeItem);

    }

    public void peekItem(){
    T getItem = stackItems.get(stackItems.size() - 1);
    System.out.println("GetItem: " + getItem);

    }

    public void printStack(){
            System.out.println(stackItems);
        

    }
}
