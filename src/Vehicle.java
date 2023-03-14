//Huvud-abstract class
abstract class Vehicle {
    private String make;
    private String model;
    private double fuel;
    private double maxSpeed;
    private double gasPrice = 19.42; // Kronor per Liter
    private double distance = 20; // Mil

    public Vehicle(String make, String model, double fuel, double maxSpeed) {    //returnerar en massa tomma saker!!!
        this.make = make;
        this.model = model;
        this.fuel = fuel;
        this.maxSpeed = maxSpeed;            //alla abstrakta saker fungerar här att returnera
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getDistance() {
        return distance;
    }
    public double getGasPrice() {
        return gasPrice;
    }
    public double getFuelConsumption() {
        return fuel;
    }
}

