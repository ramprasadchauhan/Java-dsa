import java.util.Arrays;
public class ReverseArray {
    static void reverse(int numbers[]){
      int first = 0;
      int last = numbers.length - 1;
      while (last > first) {
        // swap
        int temp = numbers[first];
         numbers[first] =  numbers[last];
         numbers[last] = temp;
         first++;
         last--;
      }
     
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(numbers));
        reverse(numbers);
        for(int i=0; i<numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
