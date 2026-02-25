package com.github.pamanne.exercises.javase017.exercise2;

public class Employee implements Comparable<Employee> {
    private String department;
    private int salary;
    private String name;
    
    public Employee(String department,int salary,String name){
        this.department=department;
        this.salary =salary;
        this.name=name;
    }

    public String getDepartment(){
        return department;
    }

    public double getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }


    @Override
    public int compareTo(Employee other){
        int departmentCompare=this.department.compareTo(other.department);
        
        if(departmentCompare != 0){
            return departmentCompare;
        }
        int salaryCompare=Integer.compare(this.salary,other.salary);
        if(salaryCompare != 0){
            return salaryCompare;
        }
        return this.name.compareTo(other.name);
        

    }

    @Override
    public String toString(){
        return "Employee{ department:" +department + ", salary:"+ salary + ", Name:" + name +"}";
    }
    
}
