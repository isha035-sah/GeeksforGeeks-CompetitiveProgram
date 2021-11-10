//this is a program to check the duplicacy like if the expression entered like" (a+b) " in stack has closing bracket
//after the expression than that is not duplicate n if the opening bracket is appeared just after the closing bracket 
// in stack than it is duplicate expression 
//input : (a+b)
//output: false (not duplicate)

package spoj.com;
import java.util.*;
public class duplicate {
 public static void main(String[] args) throws Exception {
	 Scanner sc=new Scanner(System.in);
	 String str=sc.nextLine();//asking string from the user
	 Stack<Character> st=new Stack<>();//creating stack
	 sc.nextLine();//moving to next line
	 for(int i=0;i>str.length();i++) { //
		 char ch=str.charAt(i);
		 if(ch==(')')) {
			 if(st.peek()==')') {
				 System.out.println("true");
				 return;
			 }
			 else while(st.peek()!=')') {
				 st.pop();
			 }
		 }
		 else
			st.push(ch);
	 }
	 System.out.println("false");
}
 }

