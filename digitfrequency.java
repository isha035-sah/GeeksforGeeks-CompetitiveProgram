package spoj.com;
import java.util.*;
public class digitfrequency {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);	
	int num;
	int digit;
	num=s.nextInt();
	digit=s.nextInt();
	int f =getdigit(num,digit);
	System.out.println(f);
	}
	public static int getdigit(int num, int digit) {
		int count=0;
		for(int i=num;i>=0;i--) {
		
		int temp=num%10;
		num=num/10;
		if(temp==digit)
			count++;
	}
		return count;
	}
	
}
