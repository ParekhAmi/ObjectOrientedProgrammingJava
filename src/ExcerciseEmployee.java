
//-----------------Access method by Object----------------------

public class ExcerciseEmployee {
    String name, location;
    int age;
    double salary;

    ExcerciseEmployee(String n, int a, String l, double s) {
        this.name = n;
        this.age = a;
        this.location = l;
        this.salary = s;
    }

    void raiseSalary() {
        this.salary = this.salary + 2000;
    }
}
