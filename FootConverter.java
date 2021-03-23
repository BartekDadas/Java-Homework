import java.util.Scanner;
public class FootConverter {
    Scanner input = new Scanner(System.in);
    public double convertToMetr() {
         System.out.println("Foot: ");
         double feet  = input.nextDouble();
         System.out.println("Equals:");
         return feet * 0.3080;
    }
}
