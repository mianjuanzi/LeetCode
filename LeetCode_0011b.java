import java.util.Scanner;

/**
 * Created by mianjuanzi on 2020/3/31 16:12
 */
//双指针法
public class LeetCode_0011b {
    public int maxArea(int [] height){
        int i = 0;//width
        int j = height.length-1;//height
        int res = 0;//area
        while(i < j){
            res = Math.max(res,Math.min(height[i],height[j])*(j-i));
            if(height[i]<height[j]){
                i++;
            }
            else
                j--;
        }
        return res;
    }
    public static void main(String args[]){
        LeetCode_0011b leetcode = new LeetCode_0011b();
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int [] height = new int [length];
        for(int i = 0;i < length;i++){
            height[i] = scan.nextInt();
        }
        System.out.println(leetcode.maxArea(height));
    }
}
