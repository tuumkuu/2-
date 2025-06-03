public class Truck extends Vehicle {
    private double lc;

    public Truck(String br, int yr, double lc) {
        super(br, yr);
        this.lc = lc;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + lc + " tons");
    }
}
