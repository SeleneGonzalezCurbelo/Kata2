package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram<T> {
    private final T[] data;
    
    public Histogram(T[] data) {
        this.data = data;
    }
    
    public T[] getData() {
        return data;
    }
    
    Map<T, Integer> getHistogram(){
        Map<T, Integer> map = new HashMap<T, Integer>();
        for (T key : data) {
           map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
        }
        return map;
    }
}
