//Q: Write a Java program that takes an integer input from the user (1, 2, or 3) and prints a greeting based on the number.
import java.util.*; 
public class Q2{
    public static void main(String[] args){
        //Input
        Scanner sc= new Scanner(System.in);
        int Button= sc.nextInt();
        
        //applying switch
        switch(Button){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default:System.out.println("Invalid");
        }
        sc.close();
    }
}
