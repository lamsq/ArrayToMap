import java.util.*;

public class Main {
    public static <V> Map<V, Integer> count(V[] array) {
        Map<V, Integer> map = new HashMap<>();
        for (V e : array) {
            map.put(e, map.getOrDefault(e,0)+1);
        }
        return map;
    }

    public static void main(String[] args) {
        Integer[] ints={1, 2, 3, 4, 1, 2};
        Map<Integer, Integer> intsMap = count(ints);
        System.out.println(intsMap);
    }
}
