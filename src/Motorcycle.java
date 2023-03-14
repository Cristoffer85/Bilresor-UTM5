class Motorcycle extends Vehicle {
    private final boolean windShield;

    public Motorcycle(String make, String model, double fuel, double maxSpeed, boolean windShield) {
        super(make, model, fuel, maxSpeed);
        this.windShield = windShield;
    }
    public boolean getHasWindShield() {
        return windShield;
    }
}
