/**
 * Created by mianjuanzi on 2020/2/13 15:32
 */
import java.util.Arrays;
import java.util.Scanner;

public class LeetCode_0004 {
    public double findMedianSortedArrays(int nums1[],int nums2[]){
        int m = nums1.length;
        int n = nums2.length;
        int ans [] = new int [m+n];
        for(int i = 0;i < m;i++){
            ans[i] = nums1[i];
        }
        for(int j = 0;j < n;j++){
            ans[m+j] = nums2[j];
        }
        Arrays.sort(ans);
        int a = m + n;
        double median;
        if((m+n)%2 != 0)
            median = ans[(a-1)/2];
        else
            median = 0.5*(ans[a/2]+ans[a/2-1]);
        return median;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int [] nums1 = new int [m];
        int [] nums2 = new int [n];
        for(int i = 0;i < m;i++){
            nums1 [i] = scan.nextInt();
        }
        for(int i = 0;i < n;i++){
            nums2 [i] = scan.nextInt();
        }
        LeetCode_0004 leetcode = new LeetCode_0004();
        System.out.println(leetcode.findMedianSortedArrays(nums1,nums2));
    }
}
