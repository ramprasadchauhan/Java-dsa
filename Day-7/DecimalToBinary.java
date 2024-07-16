import java.util.Scanner;

public class DecimalToBinary {

    public static void binary(int n){
        int binNum = 0;
        int i = 0;
        while (n>0) {
            binNum = binNum +  (n%2)* (int) Math.pow(10, i);
            n = n/2;
            i++;
        }
        System.out.println("Binary no is " + binNum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal no.: ");
        int n = sc.nextInt();
         binary(n);
    }
}
