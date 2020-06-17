import com.sun.deploy.security.SelectableSecurityManager;
import java.util.Scanner;
public class Find_Prime_Numbers//class name
{
    public static void main(String[] args) {// main method
        Scanner scanner = new Scanner(System.in);//import inbuilt class scanner through object
        System.out.println("****Prime Numbers****");// printing out statement
        System.out.print("Enter Your Number:- ");//printing out statment
        int value = scanner.nextInt();//define variable to store user input by using object scanner
        if(value>0)//condition for user input must greater than zero
        {
            int temp = 0;
            for (int i = 2; i <= value - 1; i++)//for loop
            {
                if (value % i == 0) //if condition for check whether rimender of value is equal to zero
                {
                    temp = temp + 1;//if condition is true then temp variable will increase by 1
                }
            }
            if (temp > 0) {//condition to check prime no by checking temp value
                System.out.println(value + "  is Not Prime");
            } else {
                System.out.println(value + "  is Prime");
            }
        }else {
            System.out.println("Invalid !!!!");
        }
    }
}
