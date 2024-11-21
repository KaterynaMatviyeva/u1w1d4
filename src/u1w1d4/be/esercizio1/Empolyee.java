package u1w1d4.be.esercizio1;

public class Empolyee {
    private String regNumb;
    private double salary;
    private Department department;

    public Empolyee(double salary, String regNumb) {
        this.salary = salary;
        this.regNumb = regNumb;

    }

    public double getSalary() {
        return salary;
    }

    public String getRegNumb() {
        return regNumb;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
