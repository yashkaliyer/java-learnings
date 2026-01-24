package collections;
import java.util.*;
public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Yash");
        map.put(2,"Rahul");
        map.put(3,"Ram");
        System.out.println("Roll no 2: " + map.get(2));
        map.remove(3);
        System.out.println("Size of map:" + map.size());
    }
}
