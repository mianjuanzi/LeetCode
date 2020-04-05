import java.util.Scanner;

/**
 * Created by mianjuanzi on 2020/3/31 15:26
 */
//暴力法
public class LeetCode_0011 {
    public int maxArea(int height[]){
        int a = 0;//容器的长
        int b = 0;//容器的宽
        int max = 0;//容器的最大容积
        for(int i = 0;i < height.length-1;i++){
            for(int j = i+1;j < height.length;j++){
                a = j-i;
                b = Math.min(height[i],height[j]);
                if(a*b > max){
                    max = a*b;
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        LeetCode_0011 leetcode = new LeetCode_0011();
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int [] height = new int [length];
        for(int i = 0;i < length;i++){
            height[i] = scan.nextInt();
        }
        System.out.println(leetcode.maxArea(height));
    }
}
