import java.util.Scanner;

public class practice1 {

    public static void main(String args[]){

        int x,y,z;

        System.out.println("Enter first number: ");

        Scanner sc1 = new Scanner(System.in);
        x = sc1.nextInt();

        System.out.println("Enter second number: ");

        Scanner sc2 = new Scanner(System.in);
        y = sc2.nextInt();

        System.out.println("Enter third number: ");

        Scanner sc3 = new Scanner(System.in);
        z = sc3.nextInt();

        System.out.println("The average of given numbers is: ");

        int p =sum(x, y, z);
        System.out.print(p);

    }

    public static int sum(int x, int y, int z){

        return (x+y+z)/3;
    
    }
    
}


