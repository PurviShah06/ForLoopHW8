import java.util.Scanner;

public class Armstrong_Number// class name
{
    public static void main(String[] args) {//main method
        Scanner scanner = new Scanner(System.in);//import inbuilt class scanner through object
        System.out.println("****Armstrong Number****");//printing out statement
        System.out.print("Enter First Value:- ");//printing out statement
        int value = scanner.nextInt();//define variable to store user input by using object scanner
       //define variables...
        int temp = value;
        int count = 0;
        //while loop for count digits of user input
        while(temp>0)
        {
         count=count+1;
         temp=temp/10;
        }
        //define variables
        int value1 = value;int modual = 0;
        int power = 0;
       //while loop for untill value1 is not 0
        while (value1 > 0)
        {int multi = 1;
            modual = value1 % 10; //get reminder of value1
            for (int i = 1; i <=count;i++)//loop for get each digits
            {
                multi = multi * modual;//multi will store reminder and multi multiplication
            }
                power = power + multi;//power variable store sum of power &multi value
                value1 = value1 / 10;//value1 divide by 10
        }
        if (power == value) {//if condition to check whether value are equal or not
            System.out.println(value + "  is an Armstrong Number");
        } else {
            System.out.println(value + "  is not an Armstrong Number");
        }
    }
}

