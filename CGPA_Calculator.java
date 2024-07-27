import java.util.Scanner;
public class CGPA_Calculator{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the marks in Subject 1:");
    int sub1= sc.nextInt();
    System.out.println("Enter the marks in Subject 2:");
    int sub2= sc.nextInt();
    System.out.println("Entyer the marks in Subject 3:");
    int sub3= sc.nextInt();
    float CGPA= (sub1 + sub2 + sub3)/30f;
    System.out.println("Your CGPA is:");
    System.out.println(CGPA);
}
}