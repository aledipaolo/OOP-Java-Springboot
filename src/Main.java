
public class Main {
    public static void main(String[] args) {

        Counter counter1 = new Counter(5);
        Counter counter2 = new Counter(10);

        // Inizio
        System.out.println("Counter 1: " + Counter.getCount());
        System.out.println("Counter 2: " + Counter.getCount());

        // Incremento metodo statico
        Counter.incrementCount(counter1);
        System.out.println("Counter 1: " + Counter.getCount());
        System.out.println("Counter 2: " + Counter.getCount()); //counter2 ha lo stesso valore di counter1

        // Get e Set con metodo non statico
        counter1.setNumber(7);
        counter2.setNumber(15);
        System.out.println("Counter 1: " + counter1.getNumber());
        System.out.println("Counter 2: " + counter2.getNumber());

        // Incremento metodo statico
        Counter.incrementCount(counter2);
        System.out.println("Counter 1: " + Counter.getCount());
        System.out.println("Counter 2: " + Counter.getCount());
    }
}