import java.util.Scanner;  
public class Operators {
    public static void main(String[] args)
    {
        float a =7/4*9/2;
        float n =7*49/7+35/7;
        System.out.println("a = "+ a );
        System.out.println("7*49/7+35/7 = "+ n);
        //Take number from user and check whether it is bigger than the given number
        int x=78;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to be checked:");
        int y= sc.nextInt();
        if (x>y==true)
        {
            System.out.println("The given number is greater than user's number.");
        }
        else
        {
            System.out.println("The given number is less than user's number.");
        }


    }

}
