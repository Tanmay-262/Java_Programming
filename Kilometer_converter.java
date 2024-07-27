import java.util.Scanner;
public class Kilometer_converter {
    public static void main(){
        Scanner cs= new Scanner (System.in);
        System.out.println("Enter the Kilometers to be converted:");
        float km= cs.nextFloat();
        float mile=km*0.621371f;
        System.out.println("Miles covered:");
        System.out.println(mile);
    }
    
}
