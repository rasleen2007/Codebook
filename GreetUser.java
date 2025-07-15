//Welcome the user and ask its name and say hi to it.
import java.util.*;
public class Project {
    public static void main(String[] args){
        //Welcoming our user
        System.out.println("Welcome");
        //Taking input from our user
        System.out.println("Please enter your name:");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        //Saying hello to the user
        System.out.println("Oh hello nice to meet you "+name);
        sc.close();    
    }
}
