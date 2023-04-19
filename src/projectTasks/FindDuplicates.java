package projectTasks;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {


    public static void main(String[] args) {

//        String str[] = { "yogi", "ram", "ram", "yogi", "yogi", "yogi", "raju", "raju", "ram", "yogi", };
//        Map<String, Integer> map = new HashMap<String, Integer>();
//        for (String s : str) {
//            if (map.containsKey(s)) {
//                map.put(s, map.get(s) + 1);
//            } else {
//                map.put(s, 1);
//            }
//        }
//        int max = 0;
//        String keyMax = "";
//        HashMap<String, Integer>maximum = new HashMap<>();
//
//        for (Map.Entry<String, Integer> e : map.entrySet()) {
//            if (max < e.getValue()){
//                max = e.getValue();
//                keyMax = e.getKey();
//            }
//
//
//        }
//        maximum.put(keyMax,max);
//        System.out.println(maximum );


        // solution
        String str[] = {"yogi", "ram", "ram", "yogi", "yogi", "yogi", "raju", "raju", "ram", "yogi",};
        HashMap<String, Integer> map = Duplicate(str);
        System.out.println(map);
    }

    public static HashMap<String, Integer> Duplicate(String[] str) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (String s : str) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        int max = 0;
        String keyMax = "";
        HashMap<String, Integer> maximum = new HashMap<>();

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (max < e.getValue()) {
                max = e.getValue();
                keyMax = e.getKey();
            }


        }
        maximum.put(keyMax, max);
        return maximum;

    }
}















