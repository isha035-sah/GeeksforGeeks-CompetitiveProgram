package spoj.com;
import java.util.*;

public class reverse {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t;
		System.out.println("enter the test case");
		t=sc.nextInt();
		
		System.out.print("enter the value of n" + " ");
		int n;
		n=sc.nextInt();
		
		int arr[]=new int[n];
		while(t!=0) {
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--)
			System.out.print(arr[i]+" ");
	
	}
}
}
//input: 1(number of test cases)
// 4 (value of n)
//1 2 3 4 
//output : 4 3 2 1