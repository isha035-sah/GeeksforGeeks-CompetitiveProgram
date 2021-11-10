package spoj.com;
import java.util.*;
import java.util.Scanner;
import java.lang.*;

public class sieve {
	private static ArrayList<Integer> sieves(int n){
		boolean isPrime[]=new boolean[n+1];
		for(int i=2;i*i<=n;i++) {
			if(isPrime[i]==true) {
				continue;
			}
			for(int j=i+i;j<=n;j+=i) {
				isPrime[j]=true;
			}
		}
		ArrayList<Integer>res=new ArrayList<>();
		for(int i=2;i<=n;i++) {
			if(isPrime[i]==false) {
				res.add(i);
			}
		}
		return res;
		
	}
	public static void segmentedSieveAlgo(int a,int b) {
		int rootb=(int)Math.sqrt(b);
		ArrayList<Integer>primes=sieves(rootb);
		boolean[]isPrime=new boolean [b-a+1];
		
		for(int prime:primes) {
			int multiple =(int)Math.ceil(a*(1.0)/prime);
			if(multiple==1) {
				multiple++;
			}
			int si=multiple*prime-a;
			for(int i=si;i<isPrime.length;i+=prime) {
				isPrime[i]=true;
			}
		}
		for(int i=0;i<isPrime.length;i++) {
			if(isPrime[i]==false && i+a!=1) {
				int val=i+a;
				System.out.println(val);
			}
		}
	}
	public static void main(String args[]) throws java.lang.Exception{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while (t-->0) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			segmentedSieveAlgo(a,b);
			System.out.println();
		}
		}

}
