import java.util.Scanner;

public class Sum_of_numbers {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first Number:");
        int a= sc.nextInt();
        System.out.println("Enter the second Number:");
        int b=sc.nextInt();
        int sum=  a+ b;
        System.out.print("The sum is:");
        System.out.print(sum);
    }
}
