public class interview {

    public static void pattern1() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        pattern1();
    }
}
