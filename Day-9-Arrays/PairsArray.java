public class PairsArray {
    public static void pair(int numbers[]){
        for(int i=0; i<numbers.length; i++){
           
            for(int j = i+1; j<numbers.length;j++){
             System.out.print("(" + numbers[i]  +", ");
             System.out.print(numbers[j] + "), ");
             System.out.println();
            }
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8};
        pair(numbers);
    }
}
