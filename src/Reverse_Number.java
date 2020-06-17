import java.util.Scanner;

public class Reverse_Number {// calss name
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//import inbuilt class scanner through object
        System.out.print("Enter Five Digits Value: ");// printing out statement
        int digit = scanner.nextInt();//define variable to store user input by using object scanner
        int reminder = 0;
        int value =digit;
        int reverse = 0;
       if (digit>0)//condition for user value must greater then zero
       {
           while (digit > 0) {//while loop
               reminder = digit % 10;//get reminder of user input
               reverse = reverse * 10 + reminder;//get reminder
               digit = digit / 10;
           }
           System.out.println("Reverse Number of  "+value+" is "+" = "  + reverse);// printing out statement
       }else {
           System.out.println("Invalid Entry!!!!!!!!!!!!!");
             }
    }
}
