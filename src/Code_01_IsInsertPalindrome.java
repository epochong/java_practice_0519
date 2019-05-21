import java.util.Scanner;
import java.util.Stack;

/**
 * @author wangchong
 * @date 2019/5/21 4:38
 * @email 876459397@qq.com
 * @CSDN https://blog.csdn.net/wfcn_zyq
 * @describe
 */
public class Code_01_IsInsertPalindrome {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            if (stack.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();

        //String str = input.next();
        String b = input.next();
        //String str = input.nextLine();
        int sum = 0;
        StringBuffer cur = new StringBuffer(a);
        for (int i = 0; i <= a.length(); i++) {
             cur = (cur.insert(i,b));
            if (isPalindrome(String.valueOf(cur))) {
                sum++;
            }
            cur = new StringBuffer(a);
        }
        System.out.println(sum);
    }
}
