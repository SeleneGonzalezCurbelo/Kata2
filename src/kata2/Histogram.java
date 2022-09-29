package kata2;

import java.util.HashMap;
import java.util.Map;

// Version 3

public class Histogram {
    private final int[] data;

    public Histogram(int[] data) {
        this.data = data;
    }
    
    Map<Integer, Integer> getHistogram(){
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int key : data) {
           map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        } 
        return map;
    }
}
