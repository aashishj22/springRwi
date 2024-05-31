package org.example.employee;

public class Employee {
    private int eid;
    private String name;
    private String desg;
    private String Salary;

    public Employee() {
        super();
    }

    public Employee(int eid, String name, String desg, String Salary) {
        this.eid = eid;
        this.name = name;
        this.desg = desg;
        this.Salary = Salary;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String Salary) {
        this.Salary = Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", desg='" + desg + '\'' +
                ", Salary='" + Salary + '\'' +
                '}';
    }
}
