package com.github.pamanne.exercises.javase015.exercise2;

public class Task {
    private int id;
    private String description;
    private String priority;
    private boolean completed;

    public Task(int id, String description, String priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
        this.completed = false;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public boolean isCompleted() {  
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String toString() {
        return "Task{ID=" + id + ", Description=" + description + ", Priority=" + priority + ", Completed=" + completed
                + "}";
    }
}
