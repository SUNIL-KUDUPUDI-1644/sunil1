

package com.cg.eis.bean;


public class Employee
{
    public int id;
    public String name;
    public int salary;
    public String design;
    public String insurancescheme;
    


    public Employee(int id, String name, int salary, String design)
    {
        
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.design = design;
    }
    public Employee() {
        // TODO Auto-generated constructor stub
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", design=" + design + "]";
    }





}





