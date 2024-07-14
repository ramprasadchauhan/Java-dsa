
public class Arithmetic_Operator {
    public static void main(String[] args) {
        // Binary operator
        int a = 10;
        int b = 5;
        System.out.println( "sum of a and b is: "+ (a+b)); // 15
        System.out.println(a-b); // 5
        System.out.println(a*b); // 50
        System.out.println(a/b); // 2
        System.out.println(a%b);  // 0
        System.out.println(a++); // 10 -> a=11
        // Unary Operator
        // pre increment ++a   
        // post increment a++
        int c = ++a;
        int d = a++;
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
    }
}

/*
=, +=, -=, *=, /=
 * Binary Operator
 * a+b
 * a-b
 * a*b
 * a/b
 * a%b (modulo)
 * 
 * Unary
 * ++
 * --
 */
