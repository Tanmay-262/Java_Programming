import java.util.Scanner;
public class Sum_of_3Numbers
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number:");
        int a=sc.nextInt();
        System.out.println("Enter the Second number:");
        int b=sc.nextInt();
        System.out.println("Enter the Third number:");
        int c=sc.nextInt();
        int sum = a+b+c;
        System.out.println("The sum of 3 numbers is:");
        System.out.println(sum);
    }
}
