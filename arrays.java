import java.util.Scanner;

public class arrays {

    public static void main(String args[]){

        //int[] marks = new int[3];
        //int mark[] = new int[3];   // both are valid.
        //int marks1[] = {10, 9 ,8 ,5 ,6};  // this is valid too.

        // marks[0] = 95;     // chem
        // marks[1] = 92;     // phy
        // marks[2] = 98;     // eng

        // for (int i=0; i<3; i++){
        //     System.out.print(marks[i] + " ");
        // }

        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        
        for (int i=0; i<numbers.length; i++){
            // System.out.print(numbers[i] + " ");
            if(numbers[i]==x){
                System.out.println("x found at index: " + i);
            }

        }
    }
    
}
