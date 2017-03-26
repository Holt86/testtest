package ru.testGit;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by user on 24.03.2017.
 */
public class Second {

    public static Map<Integer, String> getMap(){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Первый1");
        map.put(2, "Первый2");
        map.put(3, "Первый3");
        map.put(4, "Первый4");
        map.put(5, "Первый5");
        map.put(6, "Первый6");
        map.put(7, "Первый7");

        return map;
    }
}
