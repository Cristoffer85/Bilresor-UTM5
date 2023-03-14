class Truck extends Vehicle {
    private int doors;
    private double loadingCapacity;

    public Truck(String make, String model, double fuel, double maxSpeed, int doors, double loadingCapacity) {
        super(make, model, fuel, maxSpeed);
        this.doors = doors;
        this.loadingCapacity = loadingCapacity;}

        public int getNumDoors() {
        return doors;}

        public double getLoadingCapacity() {
        return loadingCapacity;}

}


