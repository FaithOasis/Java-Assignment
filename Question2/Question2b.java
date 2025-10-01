public class Question2b {
    public static void main(String[] args) {
        Car mycar = new Car("BMW", 2);
        try {
            mycar.drive();
            mycar.drive();
            mycar.drive();
        } catch (OutOfFuelException e) {
            System.out.println(e.getMessage());
        }
        
    }
}
