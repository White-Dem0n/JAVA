public class backTracking {

    public static void permutations(String str, String perm, int idx) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char curchar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + i);
            permutations(newstr, perm + curchar, idx + 1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        permutations(str, "", 0);
    }
}
