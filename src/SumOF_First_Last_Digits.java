import java.util.Scanner;

public class SumOF_First_Last_Digits
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//import inbuilt class scanner through object
        System.out.print("Enter Value:");// printing out statement
        int user_value=scanner.nextInt();//define variable to store user input by using object scanner
        int first_val=0;int last_val=0;int sum=0;//initialisation of variables
        if (user_value>=10000&& user_value<100000)//condition for user value must btwn 5 digits
        {
            first_val =user_value%10;//to get reminder to get last digit
            last_val=user_value/10000;//divide to get first digit
            sum=first_val+last_val;//addition first and last digit
            System.out.println("Sum of first & last digits of Value is :-  "+sum);
        }
      else {
            System.out.println("Please Enter Five Digits ONLY!!");
        }
    }
}
