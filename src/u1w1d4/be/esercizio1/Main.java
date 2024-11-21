package u1w1d4.be.esercizio1;

public class Main {
    public static void main(String[] args) {
        Empolyee emp1 = new Empolyee(1000,"123");
        emp1.setDepartment(Department.AMMINISTRAZIONE);
        Empolyee emp2 = new Empolyee(2000,"124");
        emp2.setDepartment(Department.AMMINISTRAZIONE);
        Empolyee emp3 = new Empolyee(3000,"125" +
                "");
        emp3.setDepartment(Department.AMMINISTRAZIONE);

        Empolyee[] employees = {emp1, emp2, emp3};

        //ciclo for per stampare le 3 matricole
    }
}
