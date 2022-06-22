package app.solutions;

public class ArrayDemo {
    public static void main(String[] args) {
        int student_id[] = new int[5];
        student_id[0] = 50;
        student_id[1] = 60;
        student_id[2] = 40;
        student_id[3] = 80;
        student_id[4] = 70;
        int sizeofarray = student_id.length;
        System.out.println("Lemgth of Array is " + sizeofarray);

        for (int i = 0; i < sizeofarray; i++) {
            System.out.println("Student ID is " + student_id[i]);
        }

    }
}
