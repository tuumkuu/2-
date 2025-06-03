public class Car extends Vehicle {
    private int dr;

    public Car(String br, int yr, int dr) {
        super(br, yr);
        this.dr = dr;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + dr);
    }
}
