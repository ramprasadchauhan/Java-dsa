import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      float a = 25.999f;
      int b = (int) a;
      System.out.println(b);
      char ch = 'a';
      int number = ch;
      System.out.println(number);
    }
}
