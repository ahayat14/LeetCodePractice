package app.solutions;

public class Constructor {
    int roll;
    double marks;

    public Constructor(int roll, double marks) {
        this.roll = roll;
        this.marks = marks;
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor(1, 80.5);
        obj1.show();

        Constructor obj2 = new Constructor(2, 85.8);
        obj2.show();

        Constructor obj3 = new Constructor(3, 90.6);
        obj3.show();

        Constructor obj4 = new Constructor(4, 95.5);
        obj4.show();

    }

    public void show() {
        System.out.println("Roll Number " + roll + " " + "and his marks is " + marks);
    }
}
