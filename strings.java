import java.util.Scanner;

public class strings {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        //name
        System.out.println("Please enter yout name ");
        String name = sc.next();
        System.out.println(name);

        // take input of a whole line
        System.out.println("Please tell us something about us ");
        String line = sc.next();
        System.out.println(line);

        // for comparing strings we can use '.compareTo' and '==' both
        String x1 = "Hony";
        String x2 = "Hony";

        // .compareTo function for comparing two strings
        if(x1.compareTo(x2)==0){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        // == for comparing two Strings
        if (x1 == x2){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        // while doing this we can get to know that both strings can be same but both have diffrent saved location in memory.
        if(new String("willy") == new String("willy")){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }


        // for getting subString from a String
        String sentence = "My name is Tony";
        // substring(beginingIndex,endingIndex)
        String subs = sentence.substring(11, sentence.length());
        System.out.println(subs);


        // Strings are immutable.

    }
    
}
