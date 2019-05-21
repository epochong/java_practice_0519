/**
 * @author wangchong
 * @date 2019/5/21 5:04
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_02_Finder {
    public static int findKth(int[] a, int n, int K) {
        // write code here
     return a[quickSort(a,0,n - 1,K)];
    }

    public static int quickSort(int[] arr, int left, int right,int k) {
        if (left < right) {
            int[] p = partition(arr,left,right);
            if (k - 1 > p[0] && k - 1 < p[1]) {
                return p[0] + 1;
            } else if (k - 1 <= p[0]) {
                return quickSort(arr,left,p[0],k);
            } else if (k - 1 >= p[1]) {
                return quickSort(arr,p[1],right,k);
            }
        }
        if (left == 0) {
            return 0;
        } else {
            return right;
        }
    }
    public static int[] partition(int[] a,int left, int right) {
        int less = left - 1;
        int more = right;
        while (left < more) {
            if (a[left] < a[right]) {
                swap(a,left++,++less);
            } else if (a[left] > a[right]) {
                swap(a,left,--more);
            } else {
                left++;
            }
        }
        swap(a,more++,right);
        return new int[]{less,more};
    }
    public static void swap(int[] arr ,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,5,2,2,3};
        //System.out.println(findKth(arr,5,1));
        //System.out.println(findKth(arr,5,2));
        //System.out.println(findKth(arr,5,3));
        //System.out.println(findKth(arr,5,4));
        System.out.println(findKth(arr,5,5));
    }
}
