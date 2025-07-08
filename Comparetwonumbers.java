//To input two numbers "a", "b" and tell if they are equal,'a' is greater than 'b' or less than 'b'
import java.util.*;
public class Comparetwonumbers{
    public static void main(String[] args){
        //Input
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt(); 
        int b= sc.nextInt();
        if(a==b){
            System.out.println("Both values are equal");
        }
        else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("a is less than b");
        }
        sc.close();
        }
    }
