/**
 * Created by mianjuanzi on 2020/2/27 21:08
 */
import java.util.Scanner;
public class LeetCode_0008 {
    public int atoi(String str) {
        String ans = "";
        int flag = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == '-' && str.charAt(i + 1) > '0' && str.charAt(i + 1) <= '9') || (str.charAt(i) > '0' && str.charAt(i) <= '9')) {
                ans += str.charAt(i);
                flag = i;
                break;
            }
        }
        for (int i = flag+1; i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9')
                ans += str.charAt(i);
            else break;
        }
        return Integer.parseInt(ans);
    }
    public static void main(String args[]){
        LeetCode_0008 leetcode = new LeetCode_0008();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(leetcode.atoi(str));
    }
}
