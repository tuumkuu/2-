public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Bonus: 10% of salary
    public double calculateBonus() {
        return salary * 0.10;
    }

    public void printInfo() {
        System.out.println("ner: " + name);
        System.out.println("tsalin: " + salary);
        System.out.println("bonus: " + calculateBonus());
    }
}
