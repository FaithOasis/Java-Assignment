public class Car {
    private String model;
    private int fuel;
    
    public Car(String model, int fuel){
        this.model = model;
        this.fuel = fuel;
    }

    public void drive() throws OutOfFuelException{
        if (fuel > 0) {
            fuel--;
            System.out.println("Driving " + model + ". Fuel Level: " + fuel);
        }else{
            throw new OutOfFuelException("Car is out of fuel :(");
        }
    }
}