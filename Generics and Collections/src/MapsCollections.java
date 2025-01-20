import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapsCollections {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 3);  // Kalit "apple" va qiymat 3
        map.put("banana", 5); // Kalit "banana" va qiymat 5


        int appleCount = map.get("apple");  // 3
        System.out.println(appleCount);

        boolean hasApple = map.containsKey("apple");  // true

        boolean hasThree = map.containsValue(3);  // true

        Set<String> keys = map.keySet();  // ["banana"]
        System.out.println(map);

//        entrySet():
//        Tavsif: Mapdagi barcha kalit-qiymat juftliklarini qaytaradi.
//        Natija: Kalit-qiymat juftliklari to‘plami.
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
