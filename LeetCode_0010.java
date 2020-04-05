import java.util.Scanner;

/**
 * Created by mianjuanzi on 2020/2/28 21:21
 */
public class LeetCode_0010 {
        public boolean isMatch(String text, String pattern){
            if(pattern.isEmpty()){
                return text.isEmpty();
            }
            boolean firstMatch = (!text.isEmpty()) && (text.charAt(0)==pattern.charAt(0) || text.charAt(0)=='.');
            if(pattern.length()>=2 && pattern.charAt(1)=='*'){
                return isMatch(text,pattern.substring(2))||(firstMatch && isMatch(text.substring(1),pattern));
            }
            else
                return firstMatch && isMatch(text.substring(1),pattern.substring(1));
        }
        public static void main(String args[]){
            LeetCode_0010 leetcode = new LeetCode_0010();
            Scanner scan = new Scanner(System.in);
            String text = scan.next();
            String pattern = scan.next();
            System.out.println(leetcode.isMatch(text,pattern));
        }
}
