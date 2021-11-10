package spoj.com;
import java.util.*;
public class strtokenizer {
	public static void main(String args[]) {
		System.out.println("Using constructor 1-");
		StringTokenizer st1=new StringTokenizer("Hello thi is isha sah"," ");
		while (st1.hasMoreTokens())
			System.out.println(st1.nextToken());
		
		System.out.println("Using Constructor 2-");
		StringTokenizer st2=new StringTokenizer("java: code : string",":");
				while(st2.hasMoreTokens())
						System.out.println(st2.nextToken());
				
		System.out.println("Using Constructor 3 -");
		StringTokenizer st3=new StringTokenizer("java : code : string"," :", true);
			while (st3.hasMoreTokens())
				System.out.println(st3.nextToken());
	}

}
