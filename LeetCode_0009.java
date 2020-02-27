import java.util.Scanner;

/**
 * Created by mianjuanzi on 2020/2/27 21:48
 */
public class LeetCode_0009 {
    public Boolean isPalindrome(int x){
        String s = String.valueOf(x);
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i)!=s.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        LeetCode_0009 leetcode = new LeetCode_0009();
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(leetcode.isPalindrome(x));
    }
}
