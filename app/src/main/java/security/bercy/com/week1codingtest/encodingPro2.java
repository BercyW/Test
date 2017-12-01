package security.bercy.com.week1codingtest;

import android.annotation.TargetApi;
import android.os.Build;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bercy on 12/1/17.
 */

public class encodingPro2 {


    @TargetApi(Build.VERSION_CODES.N)
    private static Map<Character, Integer> g(String s) {
        Map<Character, Integer> map = new HashMap<>();
        s.toLowerCase();
        for (int i = 97; i < 123; i++) {
            char temp = (char)i;
            map.put(temp,0);
        }
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }

        for(Map.Entry<Character, Integer> entry :map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }



        return map;
    }
}
