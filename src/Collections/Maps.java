package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        map.put("ABC", 14);
        map.put("xici", 293);
        map.put("zBH", 109);

    //   System.out.println(map.get("xici"));
        for(Map.Entry<String, Integer> entry : map.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    //    map.put("xici", 0);
        System.out.println();

        Map<String, Integer> map2 = new LinkedHashMap();
        map2.put("ABC", 14);
        map2.put("xici", 293);
        map2.put("zBH", 109);
        for(Map.Entry<String, Integer> entry : map2.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        System.out.println();

        Map<String, Integer> map3 = new TreeMap();
        map3.put("ABC", 14);
        map3.put("xici", 293);
        map3.put("zBH", 109);
        for(Map.Entry<String, Integer> entry : map3.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
        System.out.println();
    }
}
