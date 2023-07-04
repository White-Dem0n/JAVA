public class extraPRactice {

    static final int n = 5;

    public static void main(String[] args) {
        pattern4n1();
    }

    public static void pattern4n1() {
        for (int i = n; i >= 1; i--) {

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
