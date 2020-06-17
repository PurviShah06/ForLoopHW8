import java.util.Scanner;

public class Positive_Negative_Zero_Value//Class name
{
    public static void main(String[] args)// main method
    {
        Scanner scanner = new Scanner(System.in);//import inbuilt class scanner through object
        System.out.println("Enter Your Two  Value:");// printing out statement
        int user_val1=scanner.nextInt();//define variable to store user input by using object scanner
        int user_val2=scanner.nextInt();//define variable to store user input by using object scanner
        int positive=0;int negative=0;int temp1=0;int temp2=0;int temp=0;//initialisation of some variables
       if (user_val1<=user_val2) {//condition for user input must be  valid
           for (int x = user_val1; x <= user_val2; x++) // condition for looping between two user inputs
           {
               if (x == 0)//if condition for check positive ,negative,zero value
               {
                   temp++;
               } else if (x < 0)
               {
                   temp2++;
               } else {
                   temp1++;
               }
           }
           //printing out Statement for results
           System.out.println("Zero" + temp);
           System.out.println("Total Negative Nos.are :- " + temp2);
           System.out.println("Total Positive Nos. are :- " + temp1);
       }else {
           System.out.println("Please Enter Ascending Values!!!! ");
       }
    }
}
