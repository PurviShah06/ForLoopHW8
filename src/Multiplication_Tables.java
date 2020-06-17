import java.util.Scanner;
public class Multiplication_Tables
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//import inbuilt class scanner through object
        System.out.println("****Times Table****");// printing out statement
        System.out.print("Enter Value:-   ");//printing out statement
        int value = scanner.nextInt();//define variable to store user input by using object scanner
        System.out.print("Till which Nos you want your Multiplication:--");
        int temp=scanner.nextInt();//define variable to store user input by using object scanner
        int multi = 0;
        if (value>0 && temp>0)//condition to check user input must greater then 0
        {
            for (int a = 1; a <= temp; a++) {//for loop for increment of a variable
                multi = value * a;//formula for multiplication
                System.out.println(a + " * " + value + " = " + multi);//printing out statement
            }
        }else{
            System.out.println("Please Enter Positive Value .....");
        }


    }
}
