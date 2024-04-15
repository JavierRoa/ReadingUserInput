// Solo porque si, decidí hacer el ejercicio tanto con while, como con for ;).

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        System.out.println("The sum of the numbers is " + sum5Numbers());
    }
    private static int sum5Numbers () {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        for(int count = 1; count <=5; count++) {
            System.out.println("Enter number #" + count + ": ");
            if(input.hasNextInt()) {
                total += input.nextInt();
            }
            else {
                System.out.println("Invalid Value");
                input.next();
                count--;
            }
        }
        return total;
    }
    private static int sum5NumbersUsingWhile () {
        int total = 0;
        int count = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");
        while(count<=5) {
            System.out.println("Enter number #" + count + ": ");
            if(input.hasNextInt()) {
                total += input.nextInt();
                count++;
            }
            else {
                System.out.println("Invalid Value");
                input.next();
            }
        }
        return total;
    }

}
