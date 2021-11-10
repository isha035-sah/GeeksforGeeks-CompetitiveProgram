package spoj.com;
import java.util.ArrayDeque;
import java.util.*;
public class dequ {
	public static void main(String[] args) {
		ArrayDeque <Integer> ad=new ArrayDeque<>();
		ad.offerLast(12);
		ad.offerLast(22);
		ad.offerLast(32);
		ad.offerLast(42);
		System.out.println(ad);
		
		System.out.println(ad.pollFirst());
		System.out.println(ad.peek());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollFirst());System.out.println(ad.pollFirst());
		
	}

	
}
