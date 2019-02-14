/*
编写一个函数，以字符串作为输入，反转该字符串中的元音字母。

示例 1:
输入: "hello"
输出: "holle"

示例 2:
输入: "leetcode"
输出: "leotcede"


不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。

示例 1:
输入: a = 1, b = 2
输出: 3

示例 2:
输入: a = -2, b = 3
输出: 1
	*/
package lianxi0214;

import java.util.Scanner;

public class test0214 {
	public static void main(String[] args) {
		System.out.print("变换前的:");
		String s =new Scanner(System.in).nextLine();
		Solution S = new Solution();
		String a =S.reverseVowels(s);
		System.out.println("变换后的:"+a);
		/*int a ,b;
		System.out.print("请输入两个数:");
		Scanner in = new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		int c = S.getSum(a, b);
		System.out.println("结果为:"+c);*/
	}
	
}
class Solution {
    public String reverseVowels(String s) {  
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            if (!isVowel(ch[left])) 
            {
                left ++;
            } 
            else if (!isVowel(ch[right])) 
            {
                right --;
            } 
            else if (isVowel(ch[left]) && isVowel(ch[right]))
            {
                char a =ch[left];
                ch[left]= ch[right];
                ch[right]= a;
                left ++;
                right --;
            }
        }
        return new String(ch);
    }
    
public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' 
        		|| c == 'i' || c == 'o'
        		|| c == 'u' || c == 'A' 
        		|| c == 'E' || c == 'I' 
        		|| c == 'O' || c == 'U';
    }
}

/*class Solution {
    public int getSum(int a, int b) {
    	//a^b 得到的是两个数的没加进位的和，a&b 得到的是进位
        return b == 0 ? a :getSum(a^b,(a&b)<<1);
    }
}*/