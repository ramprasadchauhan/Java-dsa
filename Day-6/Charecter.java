import java.util.Scanner;

public class Charecter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int codePoint = 65; // Unicode code point for 'A'
        char ch = (char) codePoint;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print((char) (codePoint+j));
            }
            System.out.println();
        }
    }
}
