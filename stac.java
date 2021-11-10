package spoj.com;
import java.util.*;
import java.lang.*;
public class stac {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		sc.nextLine();
		while(t-->=0) {
			String a=sc.nextLine();
			if(solve(a)) {
				System.out.println("balanced bracket");
				return;
			}
			else {
				System.out.println("Unbalanced bracket");
				
			}
		}
			sc.close();
		}
		public static boolean solve(String a) {
			Stack<Character> s= new Stack <> ();
			char[] expr = a.toCharArray();
			for(int i=0;i<a.length();i++) {
				if(expr[i]=='(') {
					s.push(expr[i]);
				
				}
				if(s.empty())
					return false;
				
				if(expr[i]==')') {
					char x=s.peek();
					s.pop();
					if(x!='(') {
						return false;
					}
				}
			}
			
		return (s.empty());
		
		
	}

}
//Input:2 
// ()
//output:1 
