import java.util.Scanner;

public class Prime {
    static void prime(int n){
      if(n == 2 || n == 3 ){
        System.out.println("prime");
      }
      for(int i = 2; i<= Math.sqrt(n); i++){
        if(n%i == 0){
            System.out.println("Not prime");
            break;
        } else{
            System.out.println("Prime");
        }
      }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
    }
}
