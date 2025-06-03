public class Main {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 2020, 4);
        Truck t = new Truck("Volvo", 2018, 18.5);

        System.out.println("=== Car Inf");
        c.displayInfo();

        System.out.println("\n=== Truck Inf");
        t.displayInfo();
    }
}
