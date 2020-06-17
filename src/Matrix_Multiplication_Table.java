import java.util.Scanner;
//////////******************Not Able to Do it*************** Need HELP................
public class Matrix_Multiplication_Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****Times Table****");
        System.out.print("Enter First Value:- ");
        int value = scanner.nextInt();
        System.out.print("Enter Second  Value:- ");
        int value1 = scanner.nextInt();
        int temp = 0;
        int store = 0;
        int a = 0;
        int b = 0;

        do {
            a = value;
            System.out.print(a);
            System.out.print("       ");
            a++;
            do {

                System.out.println(value);
                System.out.println("       ");
                value++;
            } while (value > 0);
            {

            }
        } while (value <= value1);
        {
            System.out.println("   ");
        }
    }
}