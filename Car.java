public class Car extends Vehicle{
    String brand = "";

    public void Honk(){
        System.out.println("Honk!, honk!");
    }

    public void displayInfo(int numOfWheels,String color,float engineSize,String fuelType,String brand){

        System.out.println("Number of wheels: " + numOfWheels + " Color: " + color + "Size of Engine: " + engineSize + "Fuel Type: " + fuelType + "Brand: " + brand);
    }
}
