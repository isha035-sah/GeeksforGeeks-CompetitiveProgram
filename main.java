/*Constraints:
1. 1 <= T <= 100
2. 1 <= N <= 104
3. '0' <= str[i] <= '1'

Example:
Input:
2
4
0011
3
001

Output:
yes
no

*/


package spoj.com;
import java.util.*;
import java.lang.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int count=0;
		int count1=0;
		Stack<Character> st=new Stack<>();
		while(t!= 0) {
			
			int n=sc.nextInt();
			String str=sc.next();
			for(int i=0;i<n;i++) {
				char ch=str.charAt(i);
				if(ch=='0'|| ch=='1') {
				
				st.push(ch);
				}
				 if(ch=='1' ) {
					st.pop();
					count++;
					
				}
				if(ch=='0') {
				 st.pop();
				 count1++;
				 }
				
			}
			if(count==count1) {
				System.out.println("yes");
				}
			else System.out.println("no");
			
			t--;
		}
		
		
	}
}