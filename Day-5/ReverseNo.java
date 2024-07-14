import java.util.Scanner;

public class ReverseNo {
    static void reverse(int n){
        while (n>0) {
           System.out.print(n%10);
            n = n/10;
           };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();       
      reverse(n);
    }
}
