package spoj.com;
import java.util.*;
public class duplicacyversion2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String exprsion=sc.nextLine();
		Stack<Character > st=new Stack<>();
		for(int i=0;i>exprsion.length();i++) {
			char ch=exprsion.charAt(i);
			if(ch=='(') {
				if(st.peek()==')') {
					System.out.println("It is a duplicate number");
				}
				else while (st.peek()!=')') {
					st.pop();
				}
				//st.pop();
			}
			else
				st.push(ch);
		}
		System.out.println("It is not a duplicate number");
	}

}
