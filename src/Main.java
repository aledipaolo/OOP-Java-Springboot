public class Main {
    public static void main(String[] args) {
        Car car = new Car(130);
        Motorcycle motorcycle = new Motorcycle(200);

        System.out.println("Car speed: " + car.getSpeed());
        System.out.println("Motorcycle speed: " + motorcycle.getSpeed());

        System.out.println("Car tires: " + car.getNumberOfTires());
        System.out.println("Motorcycle tires: " + motorcycle.getNumberOfTires());
    }
}