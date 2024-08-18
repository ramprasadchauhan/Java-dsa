/**
 * HollowRec
 */
public class HollowRec {
    public static void hollow_rect(int row, int col){
        // outer loop
        for(int i =1; i<= row; i++){
            // inner col
            for(int j=1; j<=col; j++){
                if((i==1 || i==row) || (j==1 || j==col)){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // for(int i=0; i<4; i++){
        //     for(int j=0; j<5; j++){
        //         if((i==0 || i==3) || (j==0 || j==4)){
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        hollow_rect(6, 8);
    }
}