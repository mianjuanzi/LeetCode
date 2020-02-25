/**
 * Created by mianjuanzi on 2020/2/25 15:17
 */
import java.util.Scanner;
public class LeetCode_0006 {
    public String convert(String s, int numRows){
        String ans = "";//ans为最终输出结果
        String rows [] = new String [numRows];//rows[numRows]分别存放每一行的字符串
        for(int i = 0; i < numRows; i++){
            rows[i] = "";
        }
        int circle = 2*numRows-2;//circle为一个周期中字符个数
        for(int i = 0; i < s.length(); i++){
            if((i%circle) < numRows){
                rows[i%circle] += s.charAt(i);
            }
            else{
                rows[2*(numRows-1)-(i%circle)] += s.charAt(i);
            }
        }
        for(int i = 0; i < numRows; i++){
            ans += rows[i];
        }
        return ans;
    }
    public static void main(String args[]){
        LeetCode_0006 leetcode = new LeetCode_0006();
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int numRows = scan.nextInt();
        System.out.println(leetcode.convert(s,numRows));
    }
}

