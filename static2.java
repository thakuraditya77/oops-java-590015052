import java.util.Scanner;

class Static2 {
    int n;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Static2 m = new Static2();
        m.n = s.nextInt();

        System.out.println(m.n);

        s.close();
    }
}
