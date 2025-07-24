
package scottd;
import java.util.Scanner;

public class ScottD {

    private static int age;

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;  
        
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        
        System.out.print("\nHello "+name+" your age is "+age);
        
        if(age >=18){
            System.out.println("Votable");
        }else{
            System.out.println("Minority");
        }
    }
    
}
