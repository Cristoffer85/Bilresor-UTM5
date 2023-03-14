class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, double fuel, double maxSpeed, int doors) {
        super(make, model, fuel, maxSpeed);
        this.doors = doors;
    }
    public int getNumDoors() {
        return doors;
    }
}
