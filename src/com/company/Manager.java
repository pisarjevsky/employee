package com.company;

/**
 * Created by Admin on 31.07.2016.
 */
public class Manager {
    private String name;
    private String sername;
    private Department department;

    public Manager() {
    }

    public Manager(String name, String sername, Department department) {
        this.name = name;
        this.sername = sername;
        this.department = department;
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

    public Department getDepartment() {

        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                ", department=" + department +
                '}';
    }
}
