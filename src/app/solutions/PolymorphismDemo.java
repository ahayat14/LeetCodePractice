package app.solutions;

public class PolymorphismDemo {
    public static void main(String[] args) {
        PolymorphismDemo result = new PolymorphismDemo();
        result.add(45.5, 20);
        result.add(50, 80.6);

    }

    public void add(double a, int b) {
        double sum = a + b;
        System.out.println("Sum is " + sum);
    }

    public void add(int a, double b) {
        double sum = a + b;
        System.out.println("Sum is " + sum);
    }
}
