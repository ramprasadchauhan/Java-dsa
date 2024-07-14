import java.util.Scanner;

public class Break_Exit {
    public static void main(String[] args) {
        // Break
        for(int i =1; i< 10; i++){
            if(i == 5){
                System.out.println("Out of loop");
                break;
                
            }
            System.out.println(i);
        }

        Scanner sc = new Scanner(System.in);
       do {
        System.out.print("Enter your no. ");
        int n = sc.nextInt();
        if(n%10 == 0){
            break;
        }
        System.out.println(n);
       } while (true);
       
    }
}
