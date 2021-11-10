package spoj.com;
import java.util.*;

public class colsm {
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
	int colsum[]=new int[m];
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			colsum[j]=colsum[j]+arr[i][j];
		}
	}
	for(int i=0;i<m;i++) {
		System.out.print(colsum[i]+" ");
	}
	System.out.println();
	
 }
}
