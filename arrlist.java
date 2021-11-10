package spoj.com;
import java.util.*;

public class arrlist {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//ArrayList is used when the user is unknown about the exact size of array and by using this 
//during the run time when the user is inserting the value in the array it automatically takes the desired size.
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		for(;true;) {
			int a=sc.nextInt();
			sc.nextLine();
			if(a<0)
				break;
				arr.add(a);
		}
		
		sc.close();
		for(int i=arr.size()-1;i>=0;i--)
			System.out.print(arr.get(i)+" ");
		System.out.println( );
		
	}
}
//input: 1 2 3 4 -1
//output : 4 3 2 1