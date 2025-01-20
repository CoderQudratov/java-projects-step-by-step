import java.util.List;

public class Generics {
    //Generics-ni class, method, va interface bilan ishlatish mumkin.
    public static class Box<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }
    //Method bilan foydalanish
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

  //Interface bilan foydalanish
  public interface Pair<K, V> {
      K getKey();
      V getValue();
  }

    public class KeyValue<K, V> implements Pair<K, V> {
        private K key;
        private V value;

        public KeyValue(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }
    }

    //WildCard
    public static void printNumbers(List<? extends Number> list) {
        for (Number number : list) {
            System.out.println(number);
        }
    }



    public static void main(String[] args) {
        //Generics-ni class, method, va interface bilan ishlatish mumkin.
        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello, Generics!");
        System.out.println(stringBox.getItem());
        //Method bilan foydlaanish
        String[] names = {"Doston", "Ali", "Bob"};
        printArray(names);
    }


}
