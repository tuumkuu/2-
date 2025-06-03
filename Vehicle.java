public class Vehicle {
    protected String br;
    protected int yr;

    public Vehicle(String br, int yr) {
        this.br = br;
        this.yr = yr;
    }

    public void displayInfo() {
        System.out.println("Brand: " + br);
        System.out.println("Year: " + yr);
    }
}
