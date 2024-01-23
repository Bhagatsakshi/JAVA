import java.util.Scanner;

public class FIBONACCI_SERIES {

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println();
        int n0 = 0;
        int n1 = 1;
        System.out.println(n0);
        System.out.println(n1);
        for (int i = 2; i < n; i++) {
            int n2 = n0 + n1;
            System.out.println(n2);
            n0 = n1;
            n1 = n2;
        }
    }
}