
package pseudocode;
import java.util.Scanner; //Import Scanner

public class PseudoCode {

    
    public static void main(String[] args) {
        double Time; //Time Variabe
        double pay; //Pay Variable
        double Seconds; //Seconds Variable
        int min; //Minutes Variable
        Scanner reader = new Scanner(System.in);//Declare Scanner
        
        System.out.println("How long in minutes was your phone call?");//Asking for Minutes
        min = reader.nextInt();
        
        System.out.println("");
        System.out.println("How many seconds was in your phone call after the minutes");//Asking for Seconds
        Seconds = reader.nextDouble();
        
        if (Seconds > 0){ //Seconds If Statement to determine Minute rounding
            Time = min + 1;
        }
        else{
            Time = min;
        }
        
        if (Time <= 1){ // Pay If Statement to determin total pay
            pay = 1.25;
        }
        else if (Time > 1 && Time <= 2){
            pay = 1.25*2;
        }
        else{
            pay = (Time-2)*0.5+2.50;
        }
        
        
        System.out.println(""); //Returning Answer
        System.out.print("Your total cost is: $");
        System.out.print(pay);
        System.out.println("");
                   
    }
    
}
