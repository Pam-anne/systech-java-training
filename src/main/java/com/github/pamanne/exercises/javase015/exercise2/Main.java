package com.github.pamanne.exercises.javase015.exercise2;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addTask(new Task(1, "Fix bug", "HIGH"));
        manager.addTask(new Task(2, "Clean desk", "LOW"));
        manager.addTask(new Task(3, "Review code", "MEDIUM"));

        manager.displayTasks();
        System.out.println("Next Task: " + manager.getNextTask());

        System.out.println("\nMark Task Completed...");
        manager.completeTask(2);
        System.out.println();
        

        // linked list specific operations
       manager.linkedListOperations();
        

        

    }

}
