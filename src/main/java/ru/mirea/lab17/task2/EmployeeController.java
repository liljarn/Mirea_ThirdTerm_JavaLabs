package ru.mirea.lab17.task2;

public class EmployeeController {
    private final Employee model;
    private final EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public String getEmployeeName() {
        return this.model.getName();
    }

    public int getEmployeeSalary() {
        return this.model.getSalary();
    }

    public void setEmployeeSalary(int salary) {
        this.model.setSalary(salary);
    }

    public void updateData() {
        this.view.printEmployeeDetails(getEmployeeName(), getEmployeeSalary());
    }
}
