//To input the age from user and tell wether its an adult or not
import java.util.*; 
public class AdultOrNot{
    public static void main(String[] args){
    //Input
    Scanner sc=new Scanner(System.in);
    int age= sc.nextInt();
    System.out.println(age);

    if(age>18){
        System.out.println("Adult");
    }
    else{
        System.out.println("Not Adult");
        sc.close();
    }

    }
}
