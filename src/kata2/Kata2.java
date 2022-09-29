package kata2;

import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        Integer [] data = {1, 6, 2, 8, 3, 8, 2, 7, 3, 4, 2, 9, 0, 6};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        for(Map.Entry<Integer, Integer> entry: histogr.entrySet()){
            System.out.println(entry.getKey() + " ===> " + entry.getValue());
        }
    }
}
