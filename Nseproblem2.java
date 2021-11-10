
/*Constraints:
1. 1 <= T <= 100
2. 1 <= N <= 104
3. 1 <= arr[i] <= 109
Example:
Input:
2
3
5 4 2
5
2 5 6 3 9

Output:
2 3 -1
-1 4 4 -1 -1
Explanation:
Test Case 1: The Nearest score smaller than 1st day's score is 4, 
which is at index 2. The Nearest score smaller than 2st day's score is 2,
which is at index 3. There does not exists a score less than 3rd day.
*/

package spoj.com;
import java.util.*;
public class Nseproblem2 {
 public static void printnse() {
	 Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
	 while(t!=0) {
		 int n=sc.nextInt();
		 Stack <Integer> st=new Stack<>();
		 int []arr=new int[n];
		 int []ans=new int[n];
		 for(int i=0;i<n;i++) {
			 arr[i]=sc.nextInt();
		 }
		 st.push(0);
		 for(int i=1;i<n;i++) {
			// if(st.empty()) {
				//st.push(i);
			 //}
			 //else {
				 if(!st.empty() && arr[st.peek()]>arr[i]) {
					 ans[st.peek()]=i+1;
					 st.pop();
					 
				 }
			 st.push(i);
			
		 }//}
		 while(!st.empty()) {
			 ans[st.peek()]=-1;
			 st.pop();
		 }
		 for(int i=0;i<n;i++) {
			 System.out.print(ans[i]+" ");
		 }
		 t--;
	 }
 }
public static void main(String[] args) {
	printnse();
}
}
