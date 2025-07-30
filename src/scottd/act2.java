package act1panilag;

import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num;
            
            do {
                System.out.print("Enter a number: ");
                num = sc.nextInt();
                
                if (num == 0) {
                    System.out.println("Inputted number is Zero");
                } else if (num % 2 != 0) {
                    System.out.println("Inputted number is Odd");
                } else {
                    System.out.println("Inputted number is Even");
                }
                
            } while (num != 0);
            
            System.out.println("End");
        }
