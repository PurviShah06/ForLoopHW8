import java.util.Scanner;

public class Find_Palindrome_Number//calss name
{
    public static void main(String[] args)// main method
    {
        Scanner scanner = new Scanner(System.in);//import inbuilt class scanner through object
        System.out.println("****Palindrome Number****");// printing out Statement
        System.out.print("Enter Your Number:- ");//printing out statement
        int value = scanner.nextInt();//define variable to store user input by using object scanner
       //initialisation of variables
        int temp=value;
        int rem=0;int reverse =0;
        if(value>0) {//if condition to check whether  user input is must greater than zero
            while (temp > 0) {//while loop to check temp value is not less then zero
                rem = temp % 10;//to get reminder
                reverse = reverse * 10 + rem;//reverse value formula
                temp = temp / 10;
            }
            if (value == reverse) {//condition to check whether user input is same as reverse
                System.out.println(value + "    is a Palindrome Number ...");
            } else
                System.out.println(value + "    is Not Palindrome Number ...");
        }else
        System.out.println("Invalid Entry !!!!!!!");
    }
}

