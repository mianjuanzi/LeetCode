/**
 * Created by mianjuanzi on 2020/2/22 17:42
 */
import java.util.Scanner;
public class LeetCode_0005 {
    //findLongestPalindrome用于找出s的所有子串并判断是否是回文
    public String findLongestPalindrome(String s){
        int maxlen = 0;
        int beginIndex = 0;
        int endIndex = 0;
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(isPalindrome(s.substring(i,j+1))) {
                    if((j-i+1) > maxlen){
                        maxlen = j-i+1;
                        beginIndex = i;
                        endIndex = j+1;
                    }
                }

            }
        }
        return s.substring(beginIndex,endIndex);
    }
    //isPalindrome(String s)用于判断字符串s是否是回文
    public Boolean isPalindrome(String s){
        int len = s.length();
        for(int i = 0; i < len/2; i++){
            if(s.charAt(i)!=s.charAt(len-i-1)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        LeetCode_0005 leetcode = new LeetCode_0005();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(leetcode.findLongestPalindrome(s));
    }
}
