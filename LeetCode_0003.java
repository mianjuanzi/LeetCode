/**
 * Created by mianjuanzi on 2020/2/10 14:43
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import static java.lang.Math.max;
//思路：逐个检查所有字符串，看他们是否有重复的字符
public class LeetCode_0003 {
    //lengthOfLongestSubstring(String s)返回无重复字符的字串的长度，并找到无重复的最长字串
public int lengthOfLongestSubstring(String s) {
    int n = s.length();
    int ans = 0;
    for (int i = 0; i < n; i++) {
        for (int j = i+1; j <= n; j++) {
            if (allUnique(s,i,j))
                ans = max(ans,j-i);
        }
    }
    return ans;
}
//allUnique(String s,int start,int end)用于逐个检查字串，判断是否有重复字符
public boolean allUnique(String s,int start,int end){
    Set<Character> set = new HashSet<>();
    for(int i = start;i < end;i++){
        Character ch = s.charAt(i);
        if(set.contains(ch))
            return false;
        set.add(ch);
    }
    return true;
}
public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
   String  s = scan.next();
   LeetCode_0003 leetcode =new LeetCode_0003();
   int l = leetcode.lengthOfLongestSubstring(s);
    System.out.println(l);
}
}
