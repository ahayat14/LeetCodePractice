package app.AbstractClass;

public class HRTeam extends ITDepartment {
    public static void main(String[] args) {
        HRTeam hr = new HRTeam();
        hr.goodies();
        hr.work();
        hr.salary();

        ITDepartment it = new HRTeam();
        it.goodies();
        it.work();
        it.salary();

    }

    public void bonus() {
        System.out.println("Bonus is 1 Lakh");
    }

    public void salary() {
        System.out.println("2LA");
    }

}
