package security.bercy.com.week1codingtest;

/**
 * Created by Bercy on 12/1/17.
 */

public class Problem3 {


    public static boolean strongNum(int num) {


        int c = 0, a, temp;
        temp = num;
        while (num > 0) {
            a = num % 10;
            num = num / 10;
            c = c + (a * a * a);
        }
        if (temp == c) {
            return true;
        } else
            return false;


    }


}
