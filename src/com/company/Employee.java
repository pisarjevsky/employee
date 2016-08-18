package com.company;

/**
 * Created by Admin on 31.07.2016.
 */
public class Employee {
    private String name;
    private String sername;
    private Department department;

    public Employee() {
    }

    public Employee(String name, String sername) {
        this.name = name;
        this.sername = sername;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                '}';
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
