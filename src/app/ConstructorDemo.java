package app;

public class ConstructorDemo {
    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(1);
        obj.displayResults();
    }

    public ConstructorDemo() {
        System.out.println("Welcome to MMH");
    }

    public ConstructorDemo(String comName) {
        System.out.println("MyMedicalHUB");
    }

    public ConstructorDemo(int income) {
        System.out.println("1B " + income);
    }

    public ConstructorDemo(String emp, int empNum) {
        System.out.println("Zoom " + " 20");
    }

    public void displayResults() {
        System.out.println("MMH Rank is Start Up");
    }

}
