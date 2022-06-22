package app.solutions;

public class ChildClass extends InheritanceDemo {
    public static void main(String[] args) {
        ChildClass obj1 = new ChildClass();
        obj1.add();
        obj1.sub();
        obj1.mul();
        obj1.div();


    }

    public void mul() {
        System.out.println("Hey I'm in Child Class and Multification is 2500");
    }

    public void div() {
        System.out.println("Hey I'm in Child Class and division is 200");
    }
}
