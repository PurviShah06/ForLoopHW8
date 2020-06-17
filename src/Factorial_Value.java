import java.util.Scanner;

public class Factorial_Value//class name
{
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//import inbuilt class Scanner
        System.out.println("****Factrorial Number****");//printing out for user input
        System.out.print("Enter Your Number:- ");//printing out for user input
        long value = scanner.nextLong();//define value variable to store user input by using object scanner
        long temp =1;//define variable
        for(long i=1;i<=value;i++){//for loop to check whether user value greater then 1 and then increment in i variable to multiply with temp variable
             temp=temp*i;
        }
        System.out.println("Factorial Value of "+value+" = "+temp);// printing out Statement

    }
}
