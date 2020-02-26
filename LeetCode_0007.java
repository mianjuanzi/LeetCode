/**
 * Created by mianjuanzi on 2020/2/26 14:18
 */
import java.util.Scanner;
public class LeetCode_0007 {
    public int reserve(int x){
        int rev = 0;
        while(x!=0){
            int pop = x%10;
            x/=10;
            if(rev*10 > Integer.MAX_VALUE||(rev*10 == Integer.MAX_VALUE && pop > Integer.MAX_VALUE%10)) return 0;
            if(rev*10 < Integer.MIN_VALUE||(rev*10 == Integer.MIN_VALUE && pop < Integer.MIN_VALUE%10)) return 0;
            rev= rev*10+pop;
        }
        return rev;
    }
    public static void main(String args[]){
        LeetCode_0007 leetcode = new LeetCode_0007();
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(leetcode.reserve(x));
    }
}
