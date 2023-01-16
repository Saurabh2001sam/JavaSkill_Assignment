// Write a Java Program to swap two numbers without using the third
// variable.

public class SwapWithoutThirdVariable {
   public static void main(String[] args) {
      int num1 = 10;
      int num2 = 20;
      System.out.println("Before Swapping: num1 = "+num1+" and num2 = "+num2);
      num1 = num1 + num2;
      num2 = num1 - num2;
      num1 = num1 - num2;
      System.out.println("After Swapping: num1 = "+num1+" and num2 = "+num2);
   }
}