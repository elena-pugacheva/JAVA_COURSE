import java.util.LinkedList;
import java.util.Iterator;

public class ex_03 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(3);
        linkedlist.add(6);
        linkedlist.add(8);
        
        int sum = 0;
        Iterator<Integer> iterator = linkedlist.iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("Сумма всех элементов: " + sum);
    }
}