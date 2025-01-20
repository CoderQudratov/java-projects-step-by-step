import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Ques {
    public static void main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();

        //Elementlar qo'shish
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println(queue.remove());
        System.out.println(queue.poll());//navbatning birinchi elementini olib tashlaydi
        System.out.println(queue.peek()); //boshidagi elemntni qaytaradi lekin oshirmaydi


        Deque<Integer> deque = new LinkedList<>();

        // Boshiga va oxiriga element qo'shish
        deque.addFirst(1);  // Boshiga
        deque.addLast(2);   // Oxiriga
        deque.addFirst(3);  // Boshiga
        deque.addLast(4);   // Oxiriga

        // Elementlarni olish
        System.out.println(deque.removeFirst());  // 3
        System.out.println(deque.removeLast());   // 4

        // Navbatdagi elementlarni tekshirish
        System.out.println(deque.peekFirst());    // 1
        System.out.println(deque.peekLast());
    }
}
