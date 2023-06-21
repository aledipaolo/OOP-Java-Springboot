import models.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car ("Fiesta", "Ford", 2004);

        System.out.println(car.year);
        /*
        System.out.println(car.model); // Error: manufacturer is private
        System.out.println(car.manufacturer); // Error: manufacturer is protected
         */

        // Can get them from methods
        System.out.println(car.getModel());
        System.out.println(car.getManufacturer());
    }
}