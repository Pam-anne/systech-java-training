package com.github.pamanne.exercises.javase015.exercise2;

import java.util.LinkedList;

public class TaskManager {
    private LinkedList<Task> tasks = new LinkedList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void completeTask(int id) {
        for (Task t : tasks) {
            if (t.getId() == id) {
                t.setCompleted(true);
                System.out.println("Completed:" + t);
                return;
            }
        }
        System.out.println("Task with ID " + id + " not found");
            

        }
        


    public Task getNextTask() {
        return tasks.peek();
    }

    public void displayTasks() {

        System.out.println("Total Tasks: " + "\n" + tasks);
        System.out.println();
    }

    public void linkedListOperations() {
        System.out.println("Linked List OPeration: ");

        System.out.println("First task: " + tasks.peekFirst());
        System.out.println("Last task: " + tasks.peekLast());

        System.out.println("Queue size: " + tasks.size());

    }

}
