package com.company;

import java.util.Arrays;

/**
 * Created by Admin on 31.07.2016.
 */
public class Department {
    private String name;
    private Manager departmentMananger;
    private Employee[] employee;
    private int countEmployee =0;

    public Department() {
    }

    public Department(String name, Manager departmentMananger, Employee[] employee, int countEmployee) {
        this.name = name;
        this.departmentMananger = departmentMananger;
        this.employee = employee;
        this.countEmployee = countEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getDepartmentMananger() {
        return departmentMananger;
    }

    public void setDepartmentMananger(Manager departmentMananger) {
        this.departmentMananger = departmentMananger;
    }

    public Employee[] getEmployee() {
        return employee;
    }

    public void setEmployee(Employee[] employee) {
        this.employee = employee;
    }

    public int getCountEmployee() {
        return countEmployee;
    }

    public void setCountEmployee(int countEmployee) {
        this.countEmployee = countEmployee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", departmentMananger=" + departmentMananger +
                ", employee=" + Arrays.toString(employee) +
                ", countEmployee=" + countEmployee +
                '}';
    }
    public boolean addEmployee(Employee employee){
        // if(departmentEmployee==employee)
    }
    public boolean removeEmployee(Employee employee){

    }
}
