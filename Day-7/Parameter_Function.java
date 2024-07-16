import java.util.Scanner;

public class Parameter_Function {
    public static int sum(int a, int b){ // parameter or formal parameter
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println( "Sum is : "+ sum(a, b)); // a, b are argument
    }
}
