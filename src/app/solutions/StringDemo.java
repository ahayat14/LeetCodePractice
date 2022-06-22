package app.solutions;

public class StringDemo {
    public static void main(String[] args) {
//        java.lang.String actual = "Welcome to the Selenium Webdriver";
//        java.lang.String expected = "Welcome to the Selenium";
//
//        boolean status = actual.equals(expected);
//        System.out.println("The Status is " + status);
        String name = "Selenium WebDriver";
        boolean status = name.startsWith("Selenium");
        System.out.println("Status is " + status);

        String name2 = "Welcome to the Automation";
        boolean status2 = name2.endsWith("Welcome");
        System.out.println("Status is " + status2);
    }
}
