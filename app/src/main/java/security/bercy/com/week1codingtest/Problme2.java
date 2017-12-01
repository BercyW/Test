package security.bercy.com.week1codingtest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bercy on 12/1/17.
 */

public class Problme2 {


    private static int getMostPopularElement(int[] a){
        int maxNum = getIndex(a);
        int[] b= new int[a[maxNum]+1];
        for(int i = 0; i<a.length;i++){
            ++b[a[i]];

        }
        return getIndex(b);
    }

    private static int getIndex(int[] a) {
        int index = 0;
        for(int i = 1;i<a.length;i++){
            if(a[i]>=a[index]){
                index = i;
            }
        }
        return index;
    }
}
