import java.util.Scanner;

public class AllPrime {
    static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    // print all prime no. up to n
    public static void allPrime(int n){
        for(int i=2; i<n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        allPrime(n);
    }
}
