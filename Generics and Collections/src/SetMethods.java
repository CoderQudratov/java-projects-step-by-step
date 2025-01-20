import java.util.*;

public class SetMethods {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(3);
        System.out.println(set);
        // remove element
        set.remove(20);
        System.out.println(set);
        // element borligini teskhiradi

        System.out.println( set.contains(10));
        //element sizeni olchash
        System.out.println(set.size());
        //Tavsif: Setga iteratsiya qilish uchun iteratorni qaytaradi. Iterator yordamida Setdagi elementlarni o‘qish mumkin.
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(40);
        treeSet.add(30);
// TreeSetdagi elementlar tabiiy tartibda saqlanadi (kichikdan kattaga)
        System.out.println(treeSet);  // [10, 20, 30]

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);

// Chiqish qo‘shish tartibida bo‘ladi
        System.out.println(linkedHashSet);  // [30, 10, 20]



    }
}
