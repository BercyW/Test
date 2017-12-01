package security.bercy.com.week1codingtest;

/**
 * Created by Bercy on 12/1/17.
 */

public class encodingPro1 {

    private static String f(String s) {
        s.toLowerCase();
        int[] a = new int[s.length()];
        char temp;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            a[i] = s.charAt(i);
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]>=97&&a[i]<=122) {
                temp = (char) (122-a[i]+97);
                ans+=temp;
            }
        }

        return ans;
    }

}
