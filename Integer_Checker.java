import java.util.Scanner;
public class Integer_Checker {
    public static void main(String[] args)
    { 
        System.out.println("Enter the number:");
        Scanner sc= new Scanner(System.in);
        boolean i =sc.hasNextInt();
        if(i==true)
        {
            System.out.println("The Given number is an integer.");
        }
        else
        {
            System.out.println("The Given number is not an integer.");
        }
    }
    
}
