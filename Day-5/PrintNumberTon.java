import java.util.Scanner;

public class PrintNumberTon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        // print no 1 to n
        while (i<=n) {
            System.out.println(i);
            i++;
        }
    }
}
