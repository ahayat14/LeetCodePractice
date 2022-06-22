package app;

import app.leetCode.AddTwoNumber;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("This is a new line");
        AddTwoNumber obj = new AddTwoNumber();

        System.out.print("Type a number: ");
        Scanner myObj = new Scanner(System.in);
        int num1 = myObj.nextInt();
        System.out.print("Type another number: ");
        int num2 = myObj.nextInt();

        System.out.println(obj.sum(num1, num2));
    }

}
