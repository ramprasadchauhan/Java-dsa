

public class Conditional {
    public static void main(String[] args) {
        int age = 22;
        if(age >= 18){
            System.out.println("adult : drive , vote");
           
        }
        else if(age > 13 && age <18 ){
            System.out.println("teenger");
        }
        else{
            System.out.println("Not adult");
        }
    }
}
