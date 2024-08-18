public class InvertedPyramid {
    public static void inverted_pyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<n-i+1){
                    System.out.print(" ");
                } else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    static void inverted_pyramid_number(int n){
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j<=n-i+1){
                    System.out.print(j);
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    static void floyd_tringle(int n){
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i*i/2-i/2+j + " ");
            }
            System.out.println();
        }
    }
    static void floyd_tringle_second(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter);
                counter++;
            }
            System.out.println();
        }
    }
    static void floyd_tringle_third(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // inverted_pyramid(4);
        // inverted_pyramid_number(5);
        // floyd_tringle(4);
        // floyd_tringle_third(4);
        floyd_tringle_second(4);
    }
}
