import java.util.Scanner;

/**
 * Created by mianjuanzi on 2020/2/18 16:17
 */
public class LeetCode_0004b {
    public double findMedianSortedArrays(int [] A,int [] B){
        int m = A.length; int n = B.length;
        int [] temp; int tmp;
        if(m>n){//保证m<=n
            temp = A; A = B; B = temp;
            tmp = m; m = n; n = tmp;
        }
        int iMin = 0; int iMax = m; int halfLen = (m+n+1)/2;
        while(iMin <= iMax) {
            int i = (iMin + iMax)/2; int j = halfLen - i;
            if(i < iMax && B[j-1]>A[i]){//i小了
                iMin = i + 1;
            }
            else if(i > iMin && A[i-1]>B[j]){//i大了
                iMax = i - 1;
            }
            else{//i是完美的
                //考虑特殊情况
                //i=0、j=0、i=m、j=n
                //还要考虑m+n的奇偶
                int maxLeft = 0;
                if(i == 0) {
                    maxLeft = B[j - 1];
                }
                else if(j == 0) {
                    maxLeft = A[i - 1];
                }
                else {
                    maxLeft = Math.max(A[i-1],B[j-1]);
                }
                if((m+n)%2 == 1) {
                    return maxLeft;
                }
                int minRight = 0;
                if(i == m) {
                    minRight = B[j];
                }
                else if(j ==n) {
                    minRight = A[i];
                }
                else {
                    minRight = Math.min(A[i], B[j]);
                }
                return (maxLeft + minRight)/2;
            }
        }
        return 0.0;
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
        LeetCode_0004b leetcode = new LeetCode_0004b();
        System.out.println(leetcode.findMedianSortedArrays(nums1,nums2));
    }
}
