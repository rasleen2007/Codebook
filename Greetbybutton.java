//Q: Write a Java program that takes an integer input from the user (1, 2, or 3) and prints a greeting based on the number.
import java.util.*;
public class Greetbybutton{
    public static void main(String[] args){
        //Button
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        if(button==1){
            System.out.println("Hello");
        }
        else if(button==2){
            System.out.println("Namaste");
        }
        else if(button==3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid");
        }
        sc.close();
    }
}
