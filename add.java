import java.util.Scanner;

public class add {
   public add() {
   }
    //Ayesha Shaikh IT-B 117
   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.print("\nAddition\nenter a : ");
      int var2 = var1.nextInt();
      System.out.print("enter b : ");
      int var3 = var1.nextInt();
      int var4 = var2 + var3;
      System.out.println("sum of a and b is : " + var4);
   }
}

