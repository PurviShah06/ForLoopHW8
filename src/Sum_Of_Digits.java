import java.util.Scanner;
public class Sum_Of_Digits
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//import inbuilt class scanner through object
        System.out.print("Enter Five Digits Value: ");// printing out statement
        int val1 = scanner.nextInt();//define variable to store user input by using object scanner
        int total=0;int z=0; int count=0;
         if (val1>=10000&& val1<100000)//condition for user value must btwn 5 digits
         {
             while (val1 > 0)
             {
                 z = val1 % 10;
                 total = total + z;
                 val1 = val1 / 10;
             }
             System.out.println("Total Of First & Last Digits are = " + total);
         }else{
             System.out.println("Please Enter Five digits Only   .....");
         }
    }
}
