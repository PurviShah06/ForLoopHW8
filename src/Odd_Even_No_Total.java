import java.util.Scanner;

public class Odd_Even_No_Total {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//import inbuilt class scanner through object
        System.out.print("Enter Value:");// printing out statement
        int user_value = scanner.nextInt();//define variable to store user input by using object scanner
        int odd = 0;int even = 0;int sumeven = 0;int sumodd = 0;int store = 0;//initialisation of some variables
        if (user_value>=10000 && user_value<100000) {//condition for user value must btwn 5 digits
            while (user_value > 0) {// while loop
                store = user_value % 10;//get reminder for user input
                if (user_value % 2 == 0) {//if condition to check whether user value is positive ,negative or zero
                    sumeven = sumeven + store;
                    even++;
                } else {
                    sumodd = sumodd + store;
                    odd++;
                }
                user_value = user_value / 10;//
            }
            System.out.println("Sum of ODD Nos. are:-   " + sumodd);
            System.out.println("Numbers of Odd are :-  " + odd);
            System.out.println("Sum of Even. are:-   " + sumeven);
            System.out.println("Number of Even's are:-  " + even);
        }else {
            System.out.println("Please Enter Five Digits ONLY!!");
        }
    }
}