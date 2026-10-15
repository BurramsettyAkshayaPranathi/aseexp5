public class StudentManager {

    private int x = 10;
    private int y = 20;
    private int total = 0;

    public void calc(int a, int b) {
        int unused = 100;

        total = a + b;
        System.out.println(total);

        total = a + b;
        System.out.println(total);
    }

    public void display(String n) {
        if (n != null) {
            System.out.println(n);
        }
    }

    public void show(String n) {
        if (n != null) {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        StudentManager s = new StudentManager();
        s.calc(10, 20);
        s.display("Akshaya");
        s.show("Student");
    }
}