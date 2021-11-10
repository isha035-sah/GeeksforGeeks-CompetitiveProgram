

package spoj.com;
import java.util.*;
public class nextsmall {
	public static void printNSE()	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		Stack<Integer> st=new Stack<>();
		int nse[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		st.push(arr[0]);
		for(int i=n-1;i>=0;i--) {
			if(!st.empty()&& st.peek() >=arr[i]) {
				//st.peek()=i+1;
				st.pop();
			}
		nse[i]=st.empty()?-1:st.peek();
		st.push(arr[i]);
		}
		
	
	for(int i=0;i<n;i++) {
		System.out.print((nse[i]+" "));
	}
	}
	
	
	

	public static void main(String[] args) {
		printNSE();
	}}

