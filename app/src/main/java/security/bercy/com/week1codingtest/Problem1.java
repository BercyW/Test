package security.bercy.com.week1codingtest;

/**
 * Created by Bercy on 12/1/17.
 */

public class Problem1 {

    private static Problem1 instance;

    private Problem1(){}

    public static synchronized Problem1 getInstance() {
        if (instance == null) {
            instance = new Problem1();
        }
        return instance;
    }
}
