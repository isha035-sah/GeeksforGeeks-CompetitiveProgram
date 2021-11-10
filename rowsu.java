package spoj.com;
import java.util.*;

public class rowsu {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		int m;
		n=sc.nextInt();
		m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				arr[i][j]=sc.nextInt();
			}
			sc.nextLine();
		}
		sc.close();
		int rowsum[]=new int[n];
		for(int j=0;j<m;j++) {
			for(int i=0;i<n;i++) {
				rowsum[i]=rowsum[i]+arr[i][j];
			}
		}
		for(int j=0;j<n;j++) {
			System.out.print(rowsum[j]+" ");
		}
		System.out.println();
		
}
}
