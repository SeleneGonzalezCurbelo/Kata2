package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final String[] data;
    
    public Histogram(String[] data) {
        this.data = data;
    }
    
    Map<String, Integer> getHistogram(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String key : data) {
           map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }
        return map;
    }
}