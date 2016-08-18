package com.company;

import java.util.Arrays;

/**
 * Created by Admin on 31.07.2016.
 */
public class Company {
    private String bossname;
    private Department[] departments = new Department[10];
    private int countDepartment = 0;
    private Manager[] managers = new Manager[10];
    private int countManager = 0;
    private Employee[] employees = new Employee[30];
    private int countEmployee = 0;

    public Company() {
    }

    public Company(String bossname, Department[] departments, int countDepartment) {
        this.bossname = bossname;
        this.departments = departments;
        this.countDepartment = countDepartment;
    }

    public String getBossname() {
        return bossname;
    }

    public void setBossname(String bossname) {
        this.bossname = bossname;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public int getCountDepartment() {
        return countDepartment;
    }

    public void setCountDepartment(int countDepartment) {
        this.countDepartment = countDepartment;
    }

    public Manager[] getManagers() {
        return managers;
    }

    public void setManagers(Manager[] managers) {
        this.managers = managers;
    }

    @Override
    public String toString() {
        return "Company{" +
                "bossname='" + bossname + '\'' +
                ", departments=" + Arrays.toString(departments) +
                ", countDepartment=" + countDepartment +
                '}';
    }

    public boolean addDepartment(String name) {
        if (countDepartment < departments.length) {
            Department department = new Department();
            department.setName(name);
            departments[countDepartment++] = department;
            return true;
        }
        return false;
    }

    public boolean addManager(String name, String sername, String departmaentName) {
        if (countManager < managers.length) {
            Manager manager = new Manager();
            manager.setName(name);
            manager.setSername(sername);
            if (!(departmaentName == null) && !(departmaentName.trim().isEmpty())) {
                Department department = findDepartmentByName(name);
                if (department != null) {
                    manager.setDepartment(department);
                }
            }
            managers[countManager++] = manager;
            return true;
        }
        return false;
    }

    public Department findDepartmentByName(String name) {
        for (Department department : departments) {
            if (department.getName().equals(name)) {
                return department;
            }
        }
    }

    public boolean addEmployeeToCompany(String name, String sername) {
        if (countEmployee < employees.length) {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setSername(sername);
            employees[countEmployee++] = employee;
            return true;
        }
        return false;
    }

    public boolean addEmployeeToDepartment(String name, String sername, String departmentName) {
        if (countEmployee < employees.length) {
            Employee employee = new Employee();
            employee.setName(name);
            employee.setSername(sername);
            if (!(departmentName == null) && !(departmentName.trim().isEmpty())) {
                Department department = findDepartmentByName(name);
                if (department != null) {
                    employee.setDepartment(department);
                }
            }
            employees[countEmployee++] = employee;
            return true;
        }
        return false;
    }
/*
    public boolean removeEmployee(String name, String sername) {
if(countEmployee>0)
{
    findEmployeeByNameSername(name, sername);
}
    }

    public Employee findEmployeeByNameSername(String name, String sername)
    {
        for (Employee employee: employees) {
            if ((employee.getName().equals(name)&&(employee.getSername().equals(sername)))
            {
                return employee;
            }
        }
    }
    */

    public boolean removeDepartmentWithEmployees(String departmentName) {

    }

    public boolean removeDepartmentWithoutEmployees(String departmentName) {

    }

    public boolean changeEmployeeDepartment(String employeeName, String employeeSername, String fromDepartamentName, String toDepartamentName)


}
