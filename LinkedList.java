import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LinkedList extends Thread{
    public static void main(String[] args) {

//        LinkedList l1 = new LinkedList();
//
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//        l1.add(5);
//        l1.add(6);
//        l1.add(7);
//        //l1.add(5,5);
//        System.out.println("L1 Linked list : "+ l1);
//    }
//
//    private void add(int i) {

        int i = 19;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + "X"+(j+1) + "=" + i*(j+1);
            table += "\n";
        }
        try {
            FileWriter fileWriter = new FileWriter("fire.txt");
            fileWriter.write(table);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }




    }

}
