package review12;

import java.util.HashMap;
import java.util.Map;

public class E03Maps {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Kiwi", 2);
        map.put("Orange", 4);
        map.put("Mango", 3);
        map.put("Banana", 30);

        System.out.println(map);

        map.values().removeIf(x -> x > 3);

        System.out.println(map);


    }
}
