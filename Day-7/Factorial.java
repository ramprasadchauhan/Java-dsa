import java.util.Scanner;

public class Factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 0){
            System.out.println("Please enter positive no.");
            return;
        }
        int res = fact(n);
        System.out.println("Factorial of "+n+ " is "+ res);
    }
}
