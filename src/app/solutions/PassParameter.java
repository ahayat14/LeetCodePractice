package app.solutions;

public class PassParameter {
    public static void main(String[] args) {
        DynamicPassParameter obj = new DynamicPassParameter();
        int sum = obj.add(80, 75);
        System.out.println("Hey The Result is " + sum);
        double substraction = obj.sub(155.87, 48.5);
        System.out.println("Hey The Result is " + substraction);

        String fullname = DynamicPassParameter.getMyFullName("Abul", " " + "Hayat");
        System.out.println("My Full Name is " + fullname);
    }

//    public int add(int a, int b) {
//        int c = a + b;
//        return c;
//        //System.out.println("Hey Result is " + c);
//    }
//
//    public double sub(double x, double y) {
//        double z = x - y;
//        return z;
//        // System.out.println("Hey Result is " + z);
//    }
}
