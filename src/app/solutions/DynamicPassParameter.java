package app.solutions;

public class DynamicPassParameter {

    public static String getMyFullName(String FirstName, String LastName) {
        String fullname = FirstName + LastName;
        return fullname;
    }

    public int add(int a, int b) {
        int c = a + b;
        return c;
        //System.out.println("Hey Result is " + c);
    }

    public double sub(double x, double y) {
        double z = x - y;
        return z;
        // System.out.println("Hey Result is " + z);
    }

}
