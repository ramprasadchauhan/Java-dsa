

public class CallByValue {
    public static void swap(int a, int b){
       
        // swap 
        int temp = a;
        a = b;
        b = temp;
        // System.out.println("a = " + a); // 10
        // System.out.println("b = "+ b); // 5
    }
    public static void main(String[] args) {
         // swap - values exchange
         int a = 5;
         int b = 10;
         swap(a, b);
        System.out.println("a = " + a); // 5
        System.out.println("b = "+ b); // 10
    }
}
