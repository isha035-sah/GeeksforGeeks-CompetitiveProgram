package spoj.com;
import java.util.*;
public class revusingsta {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num;
	int counter = 0;
	int digit;
	int serdigi;
	num=sc.nextInt();
	digit=sc.nextInt();
	sc.nextLine();
	for(int i=num;i>=0;i--) {
		 serdigi=num%10;
		num=num/10;
		if(serdigi==digit)
			counter++;
		
	}
	System.out.println(counter++);
	
}
}
//input :456777
//output:6
// 1