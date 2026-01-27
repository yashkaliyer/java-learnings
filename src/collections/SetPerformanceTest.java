package collections;
import java.util.*;

public class SetPerformanceTest {
    public static void main(String[] args) {

        int n = 100000;

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        long start = System.currentTimeMillis();
        for(int i = 0; i < n; i++){
            hashSet.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("HashSet time: " + (end - start) + " ms");

        start = System.currentTimeMillis();
        for(int i = 0; i < n; i++){
            treeSet.add(i);
        }
        end = System.currentTimeMillis();
        System.out.println("TreeSet time: " + (end - start) + " ms");
    }
}
