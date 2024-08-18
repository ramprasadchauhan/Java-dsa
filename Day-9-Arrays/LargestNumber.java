import java.util.*;
public class LargestNumber {
   public static int largestNumber(int numbers[]){
       int l = Integer.MIN_VALUE;
       int s = Integer.MAX_VALUE;
    for (int i = 1; i<numbers.length; i++){
        if(numbers[i]> l){
            l = numbers[i];
        }
        if(numbers[i] < s){
            s = numbers[i];
        }
    }
    System.out.println("Smallest value is "+ s);
    return l;
   }
   
    public static void main(String[] args) {
        int numbers[] = {102,5,9,76,97,35};
        System.out.println( "Largest no in array is: "+ largestNumber(numbers));
    }
}
