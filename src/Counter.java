public class Counter {
    static int count;
    int number;

    public Counter(int number) {
        this.number = number;
    }

    public static int getCount() {
        return count;
    }
}
