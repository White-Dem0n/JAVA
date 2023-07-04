import java.util.Scanner;

import static com.sun.tools.javac.main.Option.X;

public class methodPractice {
    static int fib(int x){
        if(x == 1 || x == 2){
            

        }
        return 0;
    }
    static void multiplication(int n) {

        for(int i=0; i<=10; i++){
            System.out.format("%d x %d = %d\n", n, i, n*i);
        }

    }
    public static void main(String[] args) {
        multiplication(5);

    }
}
