import java.util.HashSet;

public class recursionquestion {

    // Tower of hanoi using recursion
    public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("transfer disk " + n + " from " + src + " to " +dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + dest);
        towerOfHanoi(n-1, helper, src, dest);
    }

    // revrse string using recursion
    public static void reversestr(String str, int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        reversestr(str, idx-1);
        System.out.println();
    }

    // finding the first and last occurance of any char in a string
    public static int first = -1;
    public static int last = -1;

    public static void findidx(String str, int idx, char element){

        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char currChar = str.charAt(idx);
        if(first==-1 && currChar==element){
            first=idx;
        }else if(currChar==element){
            last=idx;
        }

        findidx(str, idx+1, element);
    }

    //check if an array is sorted
    public static boolean checkarr(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){             
            //array is sorted till now
            return checkarr(arr, idx+1);
        
        }else{
            return false;
        }
    }


    // move all x to the end of the string
    public static void moveallx(String str, int idx, int count, String newString){
        if(idx== str.length()){
            for(int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }

        char currchar = str.charAt(idx);

        if(currchar == 'x'){

            count++;
            moveallx(str, idx+1, count, newString);

        }else{

            newString += currchar;
            moveallx(str, idx+1, count, newString);
        }
    }

    public static boolean[] map = new boolean[26];
    public static void removeDuplicates(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeDuplicates(str, idx+1, newString);
        }else{
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);

        }
    }


    // print all the subsequences of a string
    public static void subseq(String str, int idx, String newstring){
        if(idx==str.length()){

            System.out.println(newstring);
            return;

        }
        char currChar = str.charAt(idx);
        // char want to be added
        subseq(str, idx+1, newstring + currChar);

        // char does not want to be added
        subseq(str, idx+1, newstring);
    }

    // print all the "unique" subsequence of a string
    public static void uniquesubseq(String str, int idx, String newstring, HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newstring)){
                return;
            }else{
                System.out.println(newstring);
                set.add(newstring);
                return;
            }

        }
        char currChar = str.charAt(idx);
        // char want to be added
        uniquesubseq(str, idx+1, newstring + currChar, set);

        // char does not want to be added
        uniquesubseq(str, idx+1, newstring, set);
    }


    // keypad phone commbinations
    public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    public static void combi(String str, int indx, String combination){

        if(indx==str.length()){
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(indx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++){
            combi(str, indx+1, combination+mapping.charAt(i));
        }
    }
        
       

    public static void main(String[] args){
        int n=3;
        towerOfHanoi(n, "S", "H", "D");

        String str = "abcd";
        reversestr( str, str.length()-1);

        String lobe = "abaacdaefaah";
        findidx(lobe, 0, 'a');

        int[] arr = {1,3,5};
        System.out.println(checkarr(arr, 0));

        String str3 = "axbcxxds";
        moveallx(str3, 0, 0, "");

        String str4 = "abbccdaknfowhncvywvbefjkeihn";
        removeDuplicates(str4, 0, "");

        String str5 = "abc";
        subseq(str5, 0, "");

        //unique
        String str6 = "aaa";
        HashSet<String> set = new HashSet<>();
        uniquesubseq(str6, 0, "", set);

        String str7 = "4";
        combi(str7, 0, "");
        
    }
    
}
