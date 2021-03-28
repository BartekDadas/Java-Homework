import java.io.Serializable;
import java.util.Scanner;
public class FootConverter {
    Scanner input = new Scanner(System.in);
    String feet =  input.next();
     Serializable checkInput() {
        try {
           double transformFeet = Double.parseDouble(feet);
           return convertToMeter(transformFeet);
       }
       catch (NumberFormatException e){
           return feet;
       }

    }

     static double convertToMeter(double transformFeet) {
        return (transformFeet * 0.3080);
     }
}
