public class Vehicle {

    private int numOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;
    public Vehicle(){
        numOfWheels=0;
        color = "";
        engineSize = 0;
        fuelType = "";
    }
    public Vehicle(int numOfWheels,String color, float engineSize,String fuelType) {
        this.numOfWheels = numOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType = fuelType;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(float engineSize) {
        this.engineSize = engineSize;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
