public class Overloading {
    // function overloading using number of parameter
    // func to calc of 2 nums
    // public static int sum(int a, int b){
    //     return a + b;
    // }
    //  // func to calc of 3 nums
    //  public static int sum(int a, int b, int c){
    //     return a + b + c;
    // }
    // function overloading using type of parameter
    // func to cal int sum
    public static int sum(int a, int b){
        return a + b;
    }
    // func to calc float sum
    public static float sum(float a, float b){
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,4));
        System.out.println(sum(3.2f, 4.6f));
    }
}
