import java.util.Scanner;

public class BinaryToDecimal {
    // Binary to decimal no convert
   public static int binaryToDecemal(int n){
   int decimal = 0;
    int i = 0;
    while(n>0){
        decimal += (n%10)* (int) Math.pow(2, i);
        n = n/10;
        i++;
    }
    return decimal;
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary no: ");
        int n = sc.nextInt();
        System.out.println(binaryToDecemal(n));
    }
}
