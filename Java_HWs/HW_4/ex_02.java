import java.util.LinkedList;

public class ex_02 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(3);
        linkedlist.add(6);
        linkedlist.add(8);
        System.out.println("Первоначальный вид: " +linkedlist);
        enqueue(linkedlist,13); // помещает элемент в конец очереди
        System.out.println(dequeue(linkedlist)); // удалили первый элемент
        System.out.println(linkedlist);
        System.out.println(first(linkedlist)); // вывели первый элемент
        }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
        System.out.println(list);
    }

    public static int dequeue(LinkedList<Integer> list) { // возвращает первый элемент из очереди и удаляет его
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) { // возвращает первый элемент из очереди, не удаляя
        int num = list.get(0);
        return num;
    }
}

   
