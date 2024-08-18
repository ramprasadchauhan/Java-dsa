public class MaxSumSubArray {
    public static int subarray(int numbers[]){
        int max = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                  sum +=i;
                    System.out.print(numbers[k]);
                }
                if(sum > max){
                    return sum;
                }
                
            }
        
        }
      
        return max;
    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8};
     int res =   subarray(numbers);

     System.out.println("Max sum "+ res);
        
    }
}

