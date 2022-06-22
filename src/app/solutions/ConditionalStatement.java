package app.solutions;

public class ConditionalStatement {
    public static void main(String[] args) {
        System.out.println("Test Started");
//        String browser = "Firefox";
//        if (browser.equalsIgnoreCase("Chrome"))
//        {
//            System.out.println("Test Case Executed on Chrome");
//        }
//        else
//        {
//            System.out.println("Test Case Executed on Firefox");
//        }
//        System.out.println("Test End");
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("Performance is Good");
                break;

            case 2:
                System.out.println("Performance is Medium");
                break;

            case 3:
                System.out.println("Performance is Bad");
                break;

            default:
                System.out.println("Your Fired");
        }

    }


}
