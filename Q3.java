//To input a nuber from user and tell if it is odd or even 
import java.util.*;
public class Q3{
    public static void main(String[] args){
        //Input
        Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        if(Number%2==0){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
        sc.close();

    }
}
