

public class LargestNo3 {
    public static void main(String[] args) {
        int a =  60;
        int b = 56;
        int c = 57;
        if(a > b){
            if(a > c){
                System.out.println("a is largest");
            } else{
                System.out.println("c is largest");
            }
        } else{
            if(b > c){
                System.out.println("b is largest");
            } else{
                System.out.println("c is largest");
            }
        }
    }
}
