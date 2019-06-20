package PracticeDemo;

public class BuQuan_4 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = false;
        boolean d = true;
        boolean a1=a&b;
        boolean b1=b|d;
        boolean c1=!(a&d);
        boolean d1=c^d;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println(d1);

    }
}
