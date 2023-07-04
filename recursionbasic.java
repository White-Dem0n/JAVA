public class recursionbasic {

    // printing numbers in decending order using recursion
    public static void printNumb(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printNumb(n-1);
    }

    // printing numbers in acending order using recursion
    public static void printNumbs(int m){
        if(m==6){
            return;
        }
        System.out.println(m);
        printNumbs(m+1);
    }

    // printing sum of n numbers using recursion
    public static void suma(int x, int y, int sum){
        if(x==y){
            sum+=x;
            System.out.println(sum);
            return;
        }
        sum += x;
        suma(x+1, y, sum);
    }

    // printing fectorial of n numbers using recursion
    public static int calcfectorial(int i){
        if(i==1 || i==0){
            return 1;
        }
        int fact_nm1 = calcfectorial(i-1);
        int fact_n = i * fact_nm1;
        return fact_n;
    }

    // printing fibonaki series using recursion
    public static void fibo(int a, int b, int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        fibo(b, c, n-1); 

    }

    // printing x^n using recursion
    public static int pow(int x, int n){
        if(n==0){
            return 1;
        }
        if (x==0){
            return 0;
        }
        if (n%2==0){   // n is even
            return pow(x, n/2) * pow(x,n/2);
        }
        else{
            return pow(x,n/2) * pow(x,n/2) * x;
        }
    }

    public static void main(String[] args){

        int n =5;
        printNumb(n);
        System.out.println();

        int m=1;
        printNumbs(m);
        System.out.println();

        suma(1, 5, 0);
        System.out.println();

        int ans = calcfectorial(6);
        System.out.println(ans);
        System.out.println();

        int a=0; int b=1; int l=10;
        System.out.println(a);
        System.out.println(b);
        fibo(a, b, l-2);
        System.out.println();

        int x =2; 
        int ans2 = pow(x,n);
        System.out.println(ans2);

    }
}
