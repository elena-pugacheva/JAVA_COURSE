import java.util.Collections;
import java.util.LinkedList;

public class ex_01 {
    public static void main(String[] args) {

        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(3);
        linkedlist.add(6);
        linkedlist.add(8);
        System.out.print("Elements before reversing: " + linkedlist+"\n");
        System.out.print("Elements after reversing: " + reverse(linkedlist));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        Collections.reverse(list);
        return list;
    }
}

     

