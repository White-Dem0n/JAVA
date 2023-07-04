public class sorting {
    public static void main(String[] args) {
        int[] sort = { 11, 16, 4, 1, 7 };

        // time complexity = O(n^2)
        // bubble sort
        for (int i = 0; i < sort.length - 1; i++) {
            for (int j = 0; j < sort.length - 1; j++) {

                if (sort[j] > sort[j + 1]) {
                    // if conditiopn suffies then swipe locations/elements
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(sort[i] + " ");
        }
        System.out.println();

        // selection sort
        for (int i = 0; i < sort.length - 1; i++) {
            // taking the value on position i as the smallest to compare with rest of the
            // value

            int smallest = i;

            for (int j = i + 1; j < sort.length; j++) {
                if (sort[smallest] > sort[j]) {
                    smallest = j;
                }
            }
            int temp = sort[smallest];
            sort[smallest] = sort[i];
            sort[i] = temp;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(sort[i] + " ");
        }
        System.out.println();

        // Insertion sort
        for (int i = 0; i < sort.length; i++) {
            int current = sort[i];
            int j = i - 1;
            while (j >= 0 && current < sort[j]) {
                sort[j + 1] = sort[j];
                j--;
            }
            // placement
            sort[j + 1] = current;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(sort[i] + " ");
        }
        System.out.println();
    }
}
