import java.util.ArrayList;
import java.util.List;

public class ListCollections {

        public static void main(String[] args) {
            // List interfeysining ArrayList implementatsiyasidan foydalanamiz
            List<String> names = new ArrayList<>();

            // Elementlarni qo‘shish
            names.add("Doston");
            names.add("Ali");
            names.add("Bob");
            names.add(names.size()-1,"messi"); //Belgilangan indeksga element qoshadi
            names.set(0,"Izatillo"); //belgilangan indexni element almashtiradi.
            boolean doston = names.contains("Doston"); // element mavjudligini tekshiradi
            // List’ni chop qilish
            System.out.println(doston);
        }

}
