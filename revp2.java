package spoj.com;
import java.util.*;
import java.io.*;
public class revp2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t;
		t=s.nextInt();
		int n ;
		n=s.nextInt();
		int arr[]=new int[n];
		int arr2[]=new int[n];
		while(t!=0) {
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
			arr2[]=arr[i]*arr[i]-arr[i-1]*arr[i-1]+arr[i-2]*arr[i-2]-arr[i-i]*arr[i-i];
			System.out.println(arr2[]);
		}
		}
}
