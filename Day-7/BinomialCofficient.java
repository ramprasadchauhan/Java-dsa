import java.util.Scanner;

public class BinomialCofficient {
    static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static int binomial(int n , int r){
        // ncr = n!/r!(n-r)!
        return fact(n)/(fact(r)*fact(n-r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        if(n<r){
            System.out.println("n must be greater or equal to r");
            return;
        }
       int res= binomial(n , r);
       System.out.println(res);
    }
}
