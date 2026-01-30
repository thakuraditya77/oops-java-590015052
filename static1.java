import java.util.Scanner;

class Static1 {
    int n;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Static1 m = new Static1();
        m.n = s.nextInt();

        System.out.println(m.n);

        s.close();
    }
}
