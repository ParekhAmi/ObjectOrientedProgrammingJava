public class Salesperson extends Employee {

    private double commissionPercentage;

    public Salesperson(String name, int age, double salary, double commissionPercentage) {
        super(name, age, salary);
        this.commissionPercentage = commissionPercentage;
    }

    public double getCommissionPercentage() {
        return commissionPercentage;
    }

}
